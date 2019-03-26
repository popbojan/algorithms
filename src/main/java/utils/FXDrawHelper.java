package utils;

import javafx.beans.binding.Bindings;
import javafx.scene.Parent;
import javafx.scene.transform.Scale;

public class FXDrawHelper {

    public static void transformPane(Parent root) {
        Scale scale = new Scale();
        scale.setX(1);
        scale.setY(-1);
        scale.pivotYProperty().bind(Bindings.createDoubleBinding(() ->
                        root.getBoundsInLocal().getMinY() + root.getBoundsInLocal().getHeight() / 2,
                root.boundsInLocalProperty()));
        root.getTransforms().add(scale);

        root.setOnMouseClicked(e ->
                System.out.printf("Mouse clicked at [%.1f, %.1f]%n", e.getX(), e.getY()));
    }
}
