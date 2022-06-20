module nrv.chatfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens nrv.chatfx to javafx.fxml;
    exports nrv.chatfx;
}