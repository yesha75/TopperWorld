import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Voting_system extends Application {

    int PartyA=0;
    int PartyB=0;
    int PartyC=0;
    @Override
    public void start(Stage stage) throws IOException {


        VBox v1=new VBox();


        Label l1=new Label("ONLINE VOTING SYSTEM");
        l1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR ,40));
        l1.setTextFill(Color.BLACK);
        l1.setMaxWidth(Double.MAX_VALUE);
        l1.setAlignment(Pos.CENTER);

        Label l2=new Label("ENTER NAME:   ");
        Label l3=new Label("ENTER PHONE:  ");
        TextField t1=new TextField();
        TextField t2=new TextField();
        GridPane g=new GridPane();
        g.add(l2, 00, 00);
        g.add(t1, 10,00);
        g.add(l3, 00, 10);
        g.add(t2, 10,10);


        Label Vote =new Label("CAST YOUR VOTE HERE");
        Vote.setTextFill(Color.BLUEVIOLET);
        Vote.setFont(Font.font("Times New Roman",FontWeight.MEDIUM,FontPosture.REGULAR ,35));


        RadioButton r1=new RadioButton("Party A    ");
        RadioButton r2=new RadioButton("Party B    ");
        RadioButton r3=new RadioButton("Party C    ");
        // VBox vr=new VBox();
        // vr.getChildren().addAll(r1,r2,r3);


        
        Button bt1=new Button("SUBMIT YOUR VOTE");
        HBox hb=new HBox(r1,bt1);
        Button bt2=new Button("CHECK RESULTS");
        HBox hb1=new HBox(r3,bt2);


        bt1.setOnAction(e->{
                if (r1.isSelected())
                {
                    System.out.println("You have selected Party A as your vote.");
                    PartyA++;
                }
                else
                {
                    if ((r2).isSelected())
                    {
                        System.out.println("You have selected Party B as your vote." );
                    }
                    else
                    {
                        if((r3).isSelected() )
                        {
                            System.out.println("You have selected party C as your vote.") ;
                        }
                    }
                }
        });


        bt2.setOnAction(e->{
            VBox vb1=new VBox();
            Label vl1=new Label("PartyA GET : "+PartyA+"VOTES");
            Label vl2=new Label("PartyB GET : "+PartyB+"VOTES");
            Label vl3=new Label("PartyC GET : "+PartyC+"VOTES");
            Label rl1=new Label();
            if(PartyB>PartyC)
            {
                rl1.setText("Party B won");
            }
            else{
                    if(PartyA > PartyC)
                    {
                        rl1.setText("Party A Won ");
                    }
                    else
                    {
                        rl1.setText("Party C won");
                    }
                }
                        if(PartyA==0 && PartyB ==0&& PartyC==0 )
                        {
                            rl1.setText("No one voted yet");
                        }

            vb1.getChildren().add(rl1);
            vb1.setAlignment(Pos.CENTER);

            //----Set scene----//
            Scene sc2=new Scene(v1,400,400);
            Stage st=new Stage();
            st.setScene(sc2);
            st.show();
            st.setResizable(false);

                        
        });
        v1.getChildren().addAll(l1,g,Vote,hb,r2,hb1,bt1,bt2);
        Scene sc=new Scene(v1,500,500);
        stage.setTitle("VOTING SYSTEM");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}