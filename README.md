# 安卓移动开发实验二：Android布局

## 一、试验内容
通过Android studio，分别利用LinearLayout、ConstraintLayout和TableLayout实现老师要求的界面
## 二、试验代码与截图
### 1.LinearLayout
代码：

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="110dp"
        android:layout_height="165dp"
        android:orientation="vertical">

        <Button
            android:id="@+id/button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="1,1" />

        <Button
            android:id="@+id/button3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="2,1" />

        <Button
            android:id="@+id/button4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="3,1" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="99dp"
        android:layout_height="165dp"
        android:orientation="vertical">

        <Button
            android:id="@+id/button5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="1,2" />

        <Button
            android:id="@+id/button6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="2,2" />

        <Button
            android:id="@+id/button7"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="3,2" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="93dp"
        android:layout_height="165dp"
        android:orientation="vertical">

        <Button
            android:id="@+id/button8"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="1,3" />

        <Button
            android:id="@+id/button9"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="2,3" />

        <Button
            android:id="@+id/button10"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="3,3" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="110dp"
        android:layout_height="165dp"
        android:orientation="vertical">

        <Button
            android:id="@+id/button11"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="1,4" />

        <Button
            android:id="@+id/button12"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="2,4" />

        <Button
            android:id="@+id/button13"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="3,4" />
    </LinearLayout>

</LinearLayout>
```

截图：

![线性布局](https://img-blog.csdnimg.cn/20190318143452755.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YWlxaTgzNzg=,size_16,color_FFFFFF,t_70)
## 2.ConstraintLayout
代码：

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textView1"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:background="#FF3030"
        android:gravity="center"
        android:text="Red"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"/>

    <TextView
        android:id="@+id/textView2"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:background="#FFA500"
        android:gravity="center"
        android:text="Orange"
        app:layout_constraintLeft_toLeftOf="@+id/textView1"
        app:layout_constraintRight_toRightOf="@+id/textView3"
        app:layout_constraintTop_toTopOf="parent"/>

    <TextView
        android:id="@+id/textView3"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:background="#FFFF00"
        android:gravity="center"
        android:text="Yellow"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintRight_toRightOf="parent"/>

    <TextView
        android:id="@+id/textView4"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:background="#6495ED"
        android:gravity="center"
        android:text="Blue"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="@+id/textView2"
        app:layout_constraintBottom_toBottomOf="@+id/textView7" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:background="#76EE00"
        android:gravity="center"
        android:text="Green"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/textView4"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:background="#5D478B"
        android:gravity="center"
        android:text="Indigo"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toRightOf="@+id/textView4"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>

    <TextView
        android:id="@+id/textView7"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginStart="0dp"
        android:layout_marginLeft="0dp"
        android:layout_marginBottom="0dp"
        android:background="#BA55D3"
        android:gravity="center"
        android:text="Violet"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</android.support.constraint.ConstraintLayout>
```

截图：

![相对布局](https://img-blog.csdnimg.cn/20190318143611424.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YWlxaTgzNzg=,size_16,color_FFFFFF,t_70)
## 3.TableLayout
代码：

```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:stretchColumns="1">
    <TableRow>
        <TextView
            android:text="  Open..."
            android:padding="3dip" />
        <TextView
            android:text="Ctrl+O"
            android:gravity="right"
            android:padding="3dip" />
    </TableRow>
    <TableRow>
        <TextView
            android:text="  Save..."
            android:padding="3dip" />
        <TextView
            android:text="Ctrl+S"
            android:gravity="right"
            android:padding="3dip" />
    </TableRow>
    <TableRow>
        <TextView
            android:text="  Save As..."
            android:padding="3dip" />
        <TextView
            android:text="Ctrl+Shift+S"
            android:gravity="right"
            android:padding="3dip" />
    </TableRow>

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="10dp"
        android:padding="3dip"
        app:srcCompat="@android:color/darker_gray" />

    <TextView
        android:text="X Import..."
        android:padding="3dip" />

    <TableRow>
        <TextView
            android:text="X Export..."
            android:padding="3dip" />
        <TextView
            android:text="Ctrl+E"
            android:gravity="right"
            android:padding="3dip" />
    </TableRow>

    <ImageView
        android:id="@+id/imageView1"
        android:layout_width="wrap_content"
        android:layout_height="10dp"
        android:padding="3dip"
        app:srcCompat="@android:color/darker_gray" />

    <TextView
        android:text="  Quit"
        android:padding="3dip" />

</TableLayout>
```

截图：

![表格布局](https://img-blog.csdnimg.cn/20190318143650425.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YWlxaTgzNzg=,size_16,color_FFFFFF,t_70)
