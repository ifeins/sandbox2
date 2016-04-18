# sandbox2

This project is used to show a bug that I've experienced when performing a fragment transaction where each fragment hosts its own CoordinatorLayout.

Bug description:

1. Open the app
2. Tap the "Next" button
3. Scroll to the bottom - you'll notice that not all the text is scrolled. It should end with a "THE END!" string but it doesn't.

See the [following video](https://raw.githubusercontent.com/ifeins/sandbox2/master/screencaps/page2-scroll-not-working.gif) for the bug behavior.

__However if in ScrollingActivity.java you change Page2Fragment to be the 1st fragment to be displayed then scrolling will work correctly until the end__

See [this video](https://github.com/ifeins/sandbox2/blob/master/screencaps/page2-scroll-working.gif) for a working version for when Page2Fragment is displayed as the 1st fragment in the activity.
