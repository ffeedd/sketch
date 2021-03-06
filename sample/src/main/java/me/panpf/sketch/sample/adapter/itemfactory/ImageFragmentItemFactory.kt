package me.panpf.sketch.sample.adapter.itemfactory

import android.content.Context
import android.support.v4.app.Fragment

import me.xiaopan.assemblyadapter.AssemblyFragmentItemFactory
import me.panpf.sketch.sample.bean.Image
import me.panpf.sketch.sample.fragment.ImageFragment
import me.panpf.sketch.sample.util.AppConfig

class ImageFragmentItemFactory(private val context: Context, private var loadingImageOptionsId: String?) : AssemblyFragmentItemFactory<Image>() {

    override fun isTarget(o: Any): Boolean {
        return o is Image
    }

    override fun createFragment(i: Int, image: Image): Fragment {
        val showTools = AppConfig.getBoolean(context, AppConfig.Key.SHOW_TOOLS_IN_IMAGE_DETAIL)
        return ImageFragment.build(image, loadingImageOptionsId, showTools)
    }
}
