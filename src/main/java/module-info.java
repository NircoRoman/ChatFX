module nrv.chatfx {
    requires javafx.controls;
    requires javafx.fxml;



    exports nrv.chatfx.client;
    opens nrv.chatfx.client to javafx.fxml;
}