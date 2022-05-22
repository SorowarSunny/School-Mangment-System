package sample;
import java.io.FileWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TeacherController {
    // Login
    @FXML
    private Button loginTeacher;
    @FXML
    private PasswordField password;
    @FXML
    private TextField useername;
    @FXML
    private Label wronglogin;
    @FXML
    private Label emptyinfo;

    @FXML
    private Button noticeT;
    @FXML
    private Button SendA;
    @FXML
    private Button SendB;

    @FXML
    private Button attendanceT;
    @FXML
    private Button UpdateA;
    @FXML
    private Button UpdateB;
    @FXML
    private AnchorPane ScenePane;

    @FXML
    private Button resultT;
    @FXML
    private Button resultE;
    @FXML
    private Button ups;

    @FXML
    private ToggleGroup TGA;
    @FXML
    private RadioButton PresentA;
    @FXML
    private RadioButton AbsentA;

    @FXML
    private ToggleGroup TGB;
    @FXML
    private RadioButton PresentB;
    @FXML
    private RadioButton AbsentB;

    @FXML
    private ToggleGroup TGC;
    @FXML
    private RadioButton PresentC;
    @FXML
    private RadioButton AbsentC;

    @FXML
    private ToggleGroup TGD;
    @FXML
    private RadioButton PresentD;
    @FXML
    private RadioButton AbsentD;

    @FXML
    private ToggleGroup TGE;
    @FXML
    private RadioButton PresentE;
    @FXML
    private RadioButton AbsentE;

    @FXML
    private ToggleGroup TGF;
    @FXML
    private RadioButton PresentF;
    @FXML
    private RadioButton AbsentF;

    @FXML
    private TextField NoticeT;

    @FXML
    private Button btnupload;

    @FXML
    private TextField txtbangla;

    @FXML
    private TextField txtenglish;

    @FXML
    private TextField txtict;

    @FXML
    private TextField txtmath;

    @FXML
    private TextField txtroll;

    @FXML
    private TextField txtscience;


    // Login
    @FXML
    void loginbutton(ActionEvent event) throws Exception {
        if (useername.getText().equals("Noah") && password.getText().equals("123456")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else  if (useername.getText().equals("William") && password.getText().equals("123987")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else if (useername.getText().equals("Eric") && password.getText().equals("ericboss")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else   if (useername.getText().equals("Mark") && password.getText().equals("qwert")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else if (useername.getText().equals("Lewis") && password.getText().equals("dog123")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else if (useername.getText().equals("Benjamin") && password.getText().equals("56012")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else if (useername.getText().equals("") && password.getText().equals("")) {
            emptyinfo.setText("Please Enter Username & password");
        }

        else {
            wronglogin.setText("login failed !");
        }
    }

    //Button
    @FXML
    void handleTeacher(ActionEvent event){
        if(event.getSource()==noticeT){
            LoadStages("/sample/TeacherNotices.fxml");
        }

        else if(event.getSource()==attendanceT) {
            LoadStages("/sample/TeacherAttendance.fxml");
        }

        else if(event.getSource()==resultT) {
            LoadStages("/sample/TeacherResult.fxml");
        }
    }

    // Attendance
    @FXML
    void update_attend(ActionEvent event) throws IOException{
        StringBuilder sb=new StringBuilder();
        sb.append("Student Attendance  " +"\n");
        //david
        if(PresentA.isSelected()){
            sb.append("1. David: Present\n" );
        }else {
            sb.append("1. David: Absent\n" );
        }
        //jhon
        if(PresentB.isSelected()){
            sb.append("2. Jhon: Present\n" );
        }else {
            sb.append("2. Jhon: Absent\n" );
        }
        //
        if(PresentC.isSelected()){
            sb.append("3. Marry: Present\n" );
        }else {
            sb.append("3. Marry: Absent\n" );
        }
        if(PresentD.isSelected()){
            sb.append("4. Jake: Present\n" );
        }else {
            sb.append("4. Jake: Absent\n" );
        }
        if(PresentE.isSelected()){
            sb.append("5. Nick: Present\n" );
        }else {
            sb.append("5. Nick: Absent\n" );
        }
        if(PresentF.isSelected()){
            sb.append("6. Olivia: Present\n" );
        }else {
            sb.append("6. Olivia: Absent\n" );
        }

        File file = new File("E:\\documents\\UIU\\Spring 2022\\AOOP Project\\School Managment System\\src\\sample\\Attendance.txt");
        FileWriter w= new FileWriter(file);
        w.write(sb.toString());
        w.close();

        if(event.getSource()==UpdateA){
            LoadStages("/sample/AttendanceUpdateSuccess.fxml");
        }
    }

    //Notice
    @FXML
    void onsave(ActionEvent event) throws IOException {
        StringBuilder sb=new StringBuilder();
        sb.append(NoticeT.getText().toString() );

        File file = new File("E:\\documents\\UIU\\Spring 2022\\AOOP Project\\School Managment System\\src\\sample\\Notice.txt");
        FileWriter w= new FileWriter(file);
        w.write(sb.toString());
        w.close();
        if(event.getSource()==SendA){
            LoadStages("/sample/NoticeUpdateSuccess.fxml");
        }
    }

    //Result
    @FXML
    void Upload(ActionEvent event) throws IOException{
        StringBuilder sb=new StringBuilder();
        sb.append("Student result  " +"\n");
        sb.append("Roll_no:  "+ txtroll.getText().toString() +"\n" );
        sb.append("Bangla: "+txtbangla.getText().toString() +"\n");
        sb.append("English:  "+ txtenglish.getText().toString() +"\n" );
        sb.append("Math: "+txtmath.getText().toString() +"\n");
        sb.append("Science :  "+ txtscience.getText().toString() +"\n" );
        sb.append("ICT : "+txtict.getText().toString() +"\n");

        File file = new File("E:\\documents\\UIU\\Spring 2022\\AOOP Project\\School Managment System\\src\\sample\\Result.txt");
        FileWriter w= new FileWriter(file);
        w.write(sb.toString());
        w.close();

        if(event.getSource()== btnupload) {
            LoadStages("/sample/ResultUpdateSuccess.fxml");
        }
    }

    // Load
    private void LoadStages(String fxml){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
