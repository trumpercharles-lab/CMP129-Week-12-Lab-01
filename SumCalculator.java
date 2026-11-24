import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class SumCalculator extends Application{
    
    String operator="+";
    int field=1;
    Label output=new Label("0");

    Label F1=new Label("0");
    Label F2=new Label("0");

    public static void main(String args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Basic Calculator");

        Button ba=new Button("+");
        ba.setOnAction(new ChangeOperationAddition());
        Button bs=new Button("-");
        bs.setOnAction(new ChangeOperationSubtraction());
        Button bm=new Button("*");
        bm.setOnAction(new ChangeOperationMultiplication());
        Button bd=new Button("/");
        bd.setOnAction(new ChangeOperationDivision());

        Button eq=new Button("=");
        eq.setOnAction(new ButtonClickHandler());

        Button b1=new Button("1");
        b1.setOnAction(new AppendOne());
        Button b2=new Button("2");
        b2.setOnAction(new AppendTwo());
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b0=new Button("0");

        Button toggle=new Button("Field: 1");

        GridPane Grid=new GridPane();
        Grid.add(F1, 0, 0);
        Grid.add(F2, 2, 0);
        Grid.add(eq, 1, 1);

        Grid.add(output,1,2);

        Grid.add(ba, 3, 0);
        Grid.add(bs, 3, 1);
        Grid.add(bm, 3, 2);
        Grid.add(bd, 3, 3);

        Grid.add(b1, 0, 4);
        Grid.add(b2, 1, 4);
        Grid.add(b3, 2, 4);
        Grid.add(b4, 0, 5);
        Grid.add(b5, 1, 5);
        Grid.add(b6, 2, 5);
        Grid.add(b7, 0, 6);
        Grid.add(b8, 1, 6);
        Grid.add(b9, 2, 6);
        Grid.add(b0, 1, 7);

        Grid.add(toggle, 2 ,7);

        Scene Scene=new Scene(Grid);
        primaryStage.setScene(Scene);
        primaryStage.show();
    }

    public class AppendOne implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"1");
            }else{
                F2.setText(F2.getText()+"1");
            }
        }
    }

    public class AppendTwo implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"2");
            }else{
                F2.setText(F2.getText()+"2");
            }
        }
    }

    public class AppendThree implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"3");
            }else{
                F2.setText(F2.getText()+"3");
            }
        }
    }

    public class AppendFour implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"4");
            }else{
                F2.setText(F2.getText()+"4");
            }
        }
    }

    public class AppendFive implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"5");
            }else{
                F2.setText(F2.getText()+"5");
            }
        }
    }

    public class AppendSix implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"6");
            }else{
                F2.setText(F2.getText()+"6");
            }
        }
    }

    public class AppendSeven implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"7");
            }else{
                F2.setText(F2.getText()+"7");
            }
        }
    }

    public class AppendEight implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"8");
            }else{
                F2.setText(F2.getText()+"8");
            }
        }
    }

    public class AppendNine implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"9");
            }else{
                F2.setText(F2.getText()+"9");
            }
        }
    }

    public class AppendZero implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(field==1){
                F1.setText(F1.getText()+"0");
            }else{
                F2.setText(F2.getText()+"0");
            }
        }
    }

    public class ChangeOperationAddition implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            operator="+";
        }
    }

    public class ChangeOperationSubtraction implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            operator="-";
        }
    }

    public class ChangeOperationMultiplication implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            operator="*";
        }
    }

    public class ChangeOperationDivision implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            operator="/";
        }
    }

    public class ButtonClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            double val1=Double.parseDouble(F1.getText());
            double val2=Double.parseDouble(F2.getText());

            double result=0;
            if(operator=="+"){
                result=val1+val2;
            }else if(operator=="-"){
                result=val1-val2;
            }else if(operator=="*"){
                result=val1*val2;
            }else if(operator=="/"){
                result=val1/val2;
            }

            String stringResult=String.valueOf(result);
            output.setText(stringResult);
        }
    }

}
