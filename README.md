# AppbarScrollingModes
How to achieve parallax scrolling with background change on collapse

1)Add a coordianator layout and encapsulate below in it

2)AppBarLayout with a given height.

3)Add a collapsingToolbarLayout with the scroll flags scroll|exitUntilCollapsed.

4)Supply contentscrim property to above if a different image is needed on collpse.

5)Encapsulate an image view in collapsingToolbarLayout if a background is needed.

6)Supply parallax as app:layout_collapseMode for image view.

7)Add Toolbar after collapsingToolbarLayout with "pin" as app:layout_collpaseMode.

8)Add a NestedScrollView to coordinatorlayout recycler view.


**Add 'com.android.support:design:' as dependency
