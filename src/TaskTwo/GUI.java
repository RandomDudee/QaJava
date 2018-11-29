package TaskTwo;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class GUI extends Application {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, 420, 440);

        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList();
        list.setItems(items);

        Button addBtn = new Button("Add");
        addBtn.setPrefWidth(100);
        addBtn.setDisable(true);

        Button rmBtn = new Button("Remove");
        rmBtn.setPrefWidth(100);
        rmBtn.setDisable(true);

        Button clBtn = new Button("Clear");
        clBtn.setPrefWidth(100);
        clBtn.setDisable(true);

        VBox vb = new VBox(addBtn, rmBtn, clBtn);
        vb.setSpacing(15);
        vb.setTranslateX(250);
        vb.setTranslateY(20);

        Label label1 = new Label("List Input:");
        TextField listInput = new TextField();
        listInput.setPromptText("To be added to list....");

        HBox hb = new HBox();
        hb.getChildren().addAll(label1, listInput);
        hb.setSpacing(10);
        hb.setTranslateY(420);

        listInput.textProperty().addListener((observable, oldValue, newValue) -> {

            int size = listInput.getText().length();

            if (size >= 3) {
                addBtn.setDisable(false);
            } else {
                addBtn.setDisable(true);
            }

        });

        list.getItems().addListener(new ListChangeListener() {

            @Override
            public void onChanged(ListChangeListener.Change change) {

                if (list.getItems().isEmpty()) {
                    clBtn.setDisable(true);
                } else {
                    clBtn.setDisable(false);
                }

            }
        });

        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> obs, String newo, String news) {

                if (list.getItems().isEmpty()) {
                    rmBtn.setDisable(true);
                } else {
                    rmBtn.setDisable(false);
                }
            }
        });

        addBtn.setOnAction((e -> {
            listInput.getText();
            list.getItems().add(listInput.getText());
            listInput.setText("");
        }));

        rmBtn.setOnAction((e -> {
            int selectedIdx = list.getSelectionModel().getSelectedIndex();
            list.getItems().remove(selectedIdx);
        }));

        clBtn.setOnAction((e -> {
            list.getItems().removeAll(items);
        }));

        Label click = new Label("Clicks: ");
        click.setTranslateX(360);
        click.setTranslateY(430);

        primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

            int count = 0;

            public void handle(MouseEvent mouse) {

                count++;
                click.setText("Clicks: " + Integer.toString(count));

            }
        });

        root.getChildren().addAll(list, vb, hb, click);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Task 2");
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}