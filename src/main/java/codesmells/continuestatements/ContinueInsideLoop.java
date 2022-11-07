package codesmells.continuestatements;

import java.io.File;
import java.util.List;

public class ContinueInsideLoop {
    private void registerNewImages(List<File> fileList, String ftpPath) {
        var newImageAdded = false;

        for (File file : fileList) {
            if (file.isDirectory() || file.getName().contains("processed")) {
                continue;
            }

            //remaining loop logic
        }
}
