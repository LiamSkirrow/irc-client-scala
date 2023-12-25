import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint._
import scalafx.scene.text.Text
import scalafx.scene.control.SplitPane
import scalafx.scene.layout.{Region, StackPane}

// import scalafx.application.JFXApp3
// import scalafx.scene.Scene
import scalafx.Includes._
import scalafx.collections.ObservableBuffer
// import scalafx.geometry.Insets
import scalafx.scene.control.{ListView, SelectionMode}
import scalafx.scene.layout.StackPane


//////////////////


//////////////////

// main GUI object
object MainIrcApp extends JFXApp3 {
  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      //    initStyle(StageStyle.Unified)
      title = "Scala IRC Client"
      scene = new Scene(1020, 700) {
        root = {
    
          // Style Sheet loaded from external
          val hiddenSplitPaneCss = this.getClass.getResource("/css/HiddenSplitPane.css").toExternalForm
      
          // Region that will be used in the split pane
          val reg1 = new Region {
            styleClass = List("rounded")
          }
          val reg2 = new Region {
            styleClass = List("rounded")
          }
          val reg3 = new Region {
            styleClass = List("rounded")
          }

          val serverList = new StackPane {
            padding = Insets(20)
            children = new ListView[String] {
              maxWidth = 200
              items = ObservableBuffer(
                "Row 1",
                "Row 2",
                "Long Row 3",
                "Row 4",
                "Row 5",
                "Row 6",
                "Row 7",
                "Row 8",
                "Row 9",
                "Row 10",
                "Row 11",
                "Row 12",
                "Row 13",
                "Row 14",
                "Row 15",
                "Row 16",
                "Row 17",
                "Row 18",
                "Row 19",
                "Row 20"
              )
              selectionModel().selectionMode = SelectionMode.Multiple
            }
          }
      
          new StackPane {
            padding = Insets(20)
            children = new SplitPane {
              padding = Insets(20)
              dividerPositions_=(0.20, 0.80)
              items ++= Seq(serverList, reg2, reg3)
              id = "hiddenSplitter"
              stylesheets += hiddenSplitPaneCss
            }
          }
        }
      }
    }
  }
}
