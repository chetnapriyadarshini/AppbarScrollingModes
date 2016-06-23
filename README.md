# AppbarScrollingModes
<h2>Parallax scrolling with background change on collapse</h2>

1)Add a coordianator layout and encapsulate below in it

2)AppBarLayout with a given height.

3)Add a collapsingToolbarLayout with the scroll flags scroll|exitUntilCollapsed.

4)Supply contentscrim property to above if a different image is needed on collpse.

5)Encapsulate an image view in collapsingToolbarLayout if a background is needed.

6)Supply parallax as app:layout_collapseMode for image view.

7)Add Toolbar after collapsingToolbarLayout with "pin" as app:layout_collpaseMode.

8)Add a NestedScrollView to coordinatorlayout recycler view. If using recycler view set nestedscrollingenabled to true


**Add 'com.android.support:design:' as dependency

<h3>Example Layout</h3>

```<android.support.design.widget.CoordinatorLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="168dp">
        
        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/collapsing_tool_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:contentScrim="@color/colorPrimary"
            app:collapsedTitleTextAppearance="@style/TextAppearance.AppCompat.Widget.ActionBar.Title.Inverse"
            app:expandedTitleTextAppearance="@style/TextAppearance.AppCompat.Widget.ActionBar.Title.Inverse"
            app:layout_scrollFlags="scroll|exitUntilCollapsed">
            <ImageView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:src="@drawable/cooked_noodles"
                android:scaleType="centerCrop"
                app:layout_collapseMode="parallax"/>
            <android.support.v7.widget.Toolbar
                android:layout_width="match_parent"
                android:layout_height="?actionBarSize"
                android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
                app:layout_collapseMode="pin">
            </android.support.v7.widget.Toolbar>
        </android.support.design.widget.CollapsingToolbarLayout>
    </android.support.design.widget.AppBarLayout>
        <android.support.v7.widget.RecyclerView
            android:id="@+id/recycler_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginLeft="@dimen/activity_horizontal_margin"
            android:layout_marginRight="@dimen/activity_horizontal_margin"
            android:nestedScrollingEnabled="true"
            app:layout_behavior="@string/appbar_scrolling_view_behavior"/>
    </android.support.design.widget.CoordinatorLayout>```
    
    ```
