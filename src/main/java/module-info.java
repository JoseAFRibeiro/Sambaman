module net.jose {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.jose to javafx.fxml;
    opens net.jose.Controllers to javafx.fxml;

    exports net.jose;
    exports net.jose.Controllers;
    exports net.jose.GUI;
}
