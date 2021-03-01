package calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

float data = 0f;
int operation = -1;
    @FXML
    private Button one;
//asdd
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button equals;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private TextField display;


    @FXML

    public void handleButtonAction(ActionEvent event){

        if(event.getSource() == one){
            display.setText(display.getText()+ "1");
        } else if(event.getSource() == two){
            display.setText(display.getText()+ "2");
        }else if(event.getSource() == three){
            display.setText(display.getText()+ "3");
        }else if(event.getSource() == four){
            display.setText(display.getText()+ "4");
        }else if(event.getSource() == five){
            display.setText(display.getText()+ "5");
        }else if(event.getSource() == six){
            display.setText(display.getText()+ "6");
        }else if(event.getSource() == seven){
            display.setText(display.getText()+ "7");
        }else if(event.getSource() == eight){
            display.setText(display.getText()+ "8");
        }else if(event.getSource() == nine){
            display.setText(display.getText()+ "9");
        }else if(event.getSource() == zero){
            display.setText(display.getText()+ "0");
        }else if(event.getSource() == clear) {
            display.setText("");
        }
            else if (event.getSource() == plus){
                 data = Float.parseFloat(display.getText());
                 operation = 1; //Dodawanie
            display.setText("");
            }

            else if (event.getSource() == minus){
                data = Float.parseFloat(display.getText());
                operation = 2; //Odejmowanie
                display.setText("");
        }
        else if (event.getSource() == multiply){
            data = Float.parseFloat(display.getText());
            operation = 3; // Mnożenie
            display.setText("");
        }
        else if (event.getSource() == divide){
            data = Float.parseFloat(display.getText());
            operation = 4; // Dzielenie
            display.setText("");
        }
        else if (event.getSource()== equals){
            Float secondOperation = Float.parseFloat(display.getText());
            switch(operation) {
                case 1: //Dodawanie
                    Float ans = data + secondOperation;
                    display.setText(String.valueOf(ans));break;
                case 2: //Odejmowanie
                    ans = data - secondOperation;
                    display.setText(String.valueOf(ans));break;
                case 3: //Mnożenie
                    ans = data * secondOperation;
                    display.setText(String.valueOf(ans));break;
                case 4: //Dzielenie
                    ans =0f;
                    try {
                        ans = data / secondOperation;
                    } catch (Exception e) {display.setText("Error");}


                    display.setText(String.valueOf(ans));
                }
            }
            }

        }








