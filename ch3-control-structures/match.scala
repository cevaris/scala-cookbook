trait Command
case object Start extends Command
case object Go extends Command
case object Stop extends Command
case object Whoa extends Command

def stop()  = println("Stopped")
def start() = println("Started")

def executeCommand(cmd: Command) = cmd match { 
  case Start | Go => start()
  case Stop  | Whoa => stop()
}


executeCommand(Start)
executeCommand(Go)
executeCommand(Whoa)