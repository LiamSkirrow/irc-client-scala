## Scala IRC Client

### Notes
- include ScalaIRC somewhere in the window in some interesting text
- Left hand side list of servers to connect to, gives option to add/remove from list
  - Connection to servers persist even when switching between different servers. Can join arbitrarily many servers at once. 
  - When the active view is focused on another server, the other connected servers accumulate the messages in the background (up to a given buffer limit, reconfigurable) and small icons appear indicating how many unread messages there are.
- main window (top and middle of screen) displays the currently selected server's chat window.
- lower central window (bottom of screen) is a chatbox where the user types in their message before sending
- upper right hand side window has user's current information (username etc), lower right hand side window is a private message window.