package com.malam.connectors;

import com.malam.models.Answer;
import com.malam.models.Question;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static final String DB_NAME = "quiz?useSSL=false";

    private static DbConnection instance;

    private DbConnection(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }

    public Question getQuestion(int questionId){
        String query = "SELECT * FROM questions WHERE id=?";
        try(
                Connection connection = DriverManager.getConnection(
                        DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
                PreparedStatement statement = connection.prepareStatement(query);
                ){
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                String name = resultSet.getString("name");
                int rightAnswerId = resultSet.getInt("correct_answer_id");
                return new Question(questionId, name, rightAnswerId);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private int getQuestionsCount(){
        return 0;
    }

    public List<Answer> getPossibleAnswers(int questionId){
        List<Answer> answers = new ArrayList<>();
        String query = "SELECT * FROM answers WHERE question_id=?";
        try(
                Connection connection = DriverManager.getConnection(
                        DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
                PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                answers.add(new Answer(id, name));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return answers;
    }

    public int getAnswerId(int questionId) {
        String query = "SELECT correct_answer_id FROM questions WHERE id=?";
        try(
                Connection connection = DriverManager.getConnection(
                        DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
                PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                return resultSet.getInt("correct_answer_id");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public boolean isLastQuestion(int questionId) {
        String query = "SELECT id FROM questions WHERE id=?";
        try(
                Connection connection = DriverManager.getConnection(
                        DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
                PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setInt(1, questionId+1);
            ResultSet resultSet = statement.executeQuery();
            return !resultSet.next();
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }
}
