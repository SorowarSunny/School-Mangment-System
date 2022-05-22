package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class noticecontroller {

    @FXML
    private TextArea text;

    @FXML
    private Button viewbutton;

    @FXML
    void view(ActionEvent event) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("E:\\documents\\UIU\\Spring 2022\\AOOP Project\\School Managment System\\src\\sample\\Notice.txt")))) {

            String line;
            while ((line = reader.readLine()) != null)
                text.setText(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}







       /* @FXML
        void viewnotice(ActionEvent event)  {

                try (BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\STUDY\\AOOP\\working project\\AOOP Project\\School Managment System\\src\\sample\\Notice.txt")))) {

                        String line;
                        while ((line = reader.readLine()) != null)
                               Noticebox.setText(line);

                } catch (IOException e) {
                        e.printStackTrace();
                }
        }


    } */

