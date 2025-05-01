import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import org.jetbrains.compose.resources.configureWebResources
import dev.nathanmkaya.template.shared.TemplateSharedApp
import dev.nathanmkaya.template.shared.di.initKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin()

    configureWebResources {
        resourcePathMapping { path -> "./$path" }
    }

    CanvasBasedWindow(
        title = "TemplateTemplate",
        canvasElementId = "ComposeTarget",
    ) {
        TemplateSharedApp()
    }
}