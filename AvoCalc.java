import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.control.CheckBox;
import java.text.*;
import java.lang.*;

public class AvoCalc extends Application{
	
	private Text message1;
	private Text message2;
	
	private TextField tf;
		
	private Button calc; 
	
	private Avocado avo;
	
	private ToggleGroup check;
	private RadioButton yes;
	private RadioButton no;
	
	private Label checkLabel;
	
	public void start(Stage stage){
		
		
		avo = new Avocado(0);
		stage.setTitle("AvoCalculator");
		
		stage.getIcons().add(new Image("file:icon.png"));
		
		message1 = new Text("Welcome to Avocado Calculator!");
		message2 = new Text("Enter a dollar amount");
		
		tf = new TextField();
		tf.setPrefWidth(65);
		
		check = new ToggleGroup();
		yes = new RadioButton("Yes");
		no = new RadioButton("No");
		yes.setToggleGroup(check);
		no.setToggleGroup(check);
		no.setSelected(true);
		checkLabel = new Label("Are avocados on sale right now?");
		
		
		calc = new Button("How many avocados is that?");
		calc.setOnAction(this::eventHandler);
		
		FlowPane pane = new FlowPane(message1, message2, tf, checkLabel, yes, no, calc);
		pane.setHgap(15);
		pane.setVgap(20);
		pane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(pane, 270, 300);
		
		BackgroundImage bg = new BackgroundImage(new Image("file:bg.png", 400,400,false,true),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
				
		pane.setBackground(new Background(bg));
		
		stage.setScene(scene);
		stage.show();
	}
	
	public void eventHandler(ActionEvent event){
		if(event.getSource() == calc){
			avo.setDollars(Integer.parseInt(tf.getText()));
			if(yes.isSelected())
				avo.setSale(true);
			else if(no.isSelected())
				avo.setSale(false);
			avo.calculate(avo.getDollars(), avo.getSale());
			message1.setText("That's " + avo.getAvocados() + " avocados!");
		}
	}
		
		
		
	
	

	

}