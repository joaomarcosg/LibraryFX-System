module com.joao.libraryfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.joao.libraryfx to javafx.fxml;
    exports com.joao.libraryfx;
}