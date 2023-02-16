# android_binding_vs_setcontent
Repository demonstrating difference in final layout when using viewbinding vs just set content

## Problem description
Project contains 2 activities in one app:
- **SetContentActivity**  which will use **layout/actvitity_same.xml** via setContent(Int) method of an Activity
```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_same)
    }
```
- **BindingActivity** which will use **layout/actvitity_same.xml** through generated binding ActivitySameBinding
```kotlin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySameBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }
```


Same layout is used in both cases, note that layout is strictly constrained in height at the root node.
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:background="#FF00FF"
    />
```

Effect differs between these two

- BindingActivity height constraint is ignored
<img width="500" alt="image" src="https://user-images.githubusercontent.com/120931/219353109-d4e9b874-0bfd-494c-ada1-631408f5d363.png">
- SetContentActivity height constraint is respected
<img width="500" alt="image" src="https://user-images.githubusercontent.com/120931/219353267-8315877c-2646-4142-99a0-e0d65fd5cf1e.png">






