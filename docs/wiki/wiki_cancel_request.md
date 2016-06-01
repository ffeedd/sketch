Sketch会自动取消请求，因此你不必刻意关注怎么去取消一个请求，或者该在什么时候去取消一个请求

#### Sketch会在什么时候自动取消请求？
>* SketchImageView重用的时候会自动取消之前的请求
>* SketchImageView在onDetachedFromWindow的时候也会自动取消请求

#### 如果我想主动强制取消怎么办？
>* 方法1：在执行commit()或SketchImageView.display***Image()方法之后你会得到一个Request，
你可以通过Request.isCanceled()方法查看请求是否结束会或通过Request.cancel()方法取消请求
>* 方法2：你可以通过Sketch.cancel(SketchImageViewInterface)方法来取消请求

``取消请求的时候如果正在读取数据，那么就会立马停止读取，已经读取的数据就算浪费了``