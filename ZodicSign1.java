import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.time.LocalDate;

public class ZodicSign1 extends Application
{
   private Label myLabel;
   private Stage primaryStage;
   private DatePicker datePicker;
   private BackgroundImage myBI;

   
   
   public static void main(String[] args)
   {
      launch(args);
   }
   @Override
   public void start(Stage primaryStage)
   {
      this.primaryStage = primaryStage;
      
   /*   myBI = new BackgroundImage(new Image("ZodiacBackground",32,32,false,true),
      BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          BackgroundSize.DEFAULT);
      //then you set to your node
      vbox.setBackground(new Background(myBI));
    */  
      myLabel = new Label("Find out what your sign is");
      
      Button goButton = new Button("Go");
      
      goButton.setOnAction(new ButtonClickHandler());
      
      datePicker = new DatePicker();
      
      VBox vbox = new VBox(10, myLabel,datePicker, goButton);
      
      Scene scene = new Scene(vbox,500,500);
      
      vbox.setAlignment(Pos.CENTER);
      
      primaryStage.setScene(scene);
      
      primaryStage.setTitle("Zodiac Sign");
      
      primaryStage.show();
      
   }
   
   class ButtonClickHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         
         LocalDate date = datePicker.getValue();
         
         String sign = Zodiac.calculateSign(date);
         
         Label signLabel = new Label("Your sign is " + sign);    
         
         VBox vbox = new VBox(10, signLabel);
         
         Scene scene = new Scene(vbox,500,500);
      
         vbox.setAlignment(Pos.CENTER);
      
         primaryStage.setScene(scene);
      }
      
   }
   
}

/*BackgroundImage myBI= new BackgroundImage(new Image("my url",32,32,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          BackgroundSize.DEFAULT);
//then you set to your node
myContainer.setBackground(new Background(myBI));*/