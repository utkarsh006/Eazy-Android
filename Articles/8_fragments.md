# Fragments

A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. Fragments cannot live on their own--they must be hosted by an activity or another fragment. The fragment’s view hierarchy becomes part of, or attaches to, the host’s view hierarchy.

Fragments introduce modularity and reusability into your activity’s UI by allowing you to divide the UI into discrete chunks.

Consider an app that responds to various screen sizes. Dividing your UI into fragments makes it easier to modify your activity's appearance at runtime. While your activity is in the STARTED lifecycle state or higher, fragments can be added, replaced, or removed.

See https://developer.android.com/guide/fragments for more details.

## The fragment lifecycle

A fragment has its own lifecycle, receives its own input events, and you can add or remove fragments while the containing activity is running.

To manage lifecycle, Fragment implements `LifecycleOwner`, exposing a Lifecycle object that you can access through the `getLifecycle()` method.

Each possible Lifecycle state is represented in the `Lifecycle.State` enum.

- INITIALIZED
- CREATED
- STARTED
- RESUMED
- DESTROYED

See https://developer.android.com/guide/fragments/lifecycle for details.

## Create a fragment

To create a fragement, you have to do the following: 

-  Set up your environment
-  Create a fragment class
-  Add a fragment to an activity

See https://developer.android.com/guide/fragments/create#add for details.

## Saving state with fragments

Various Android system operations can affect the state of your fragment. To ensure the user's state is saved, the Android framework automatically saves and restores the fragments and the back stack. Therefore, you need to ensure that any data in your fragment is saved and restored as well.

Some operations cause your fragment to lose state.

See https://developer.android.com/guide/fragments/saving-state for details.

## Communicating with fragments

To reuse fragments, build each as a completely self-contained component that defines its own layout and behavior. Once you have defined these reusable fragments, you can associate them with an activity and connect them with the application logic to realize the overall composite UI.

To properly react to user events, or to share state information, you often need to have channels of communication between an activity and its fragments or between two or more fragments. To keep fragments self-contained, you should not have fragments communicate directly with other fragments or with its host activity.

The Fragment library provides two options for communication: a shared `ViewModel` and the Fragment Result API. The recommended option depends on the use case. o share persistent data with any custom APIs, you should use a `ViewModel`.

See https://developer.android.com/guide/fragments/communicate for details.

## More insights on how to use with fragements

Fragements are interconnected with activities. Learn more about the introductionary words above on https://developer.android.com/guide/fragments.
