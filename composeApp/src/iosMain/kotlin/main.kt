import androidx.compose.ui.window.ComposeUIViewController
import io.github.afalabarce.mvvmkmmtemplate.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
