/*
 * Copyright 2017 Debashis Paul

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moviemagic.dpaul.android.app.backgroundmodules

import android.content.Context
import android.widget.ImageView
import com.moviemagic.dpaul.android.app.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import groovy.transform.CompileStatic

@CompileStatic
class PicassoLoadImage {

    //To load the movie poster - used for Grid Adapter & Similar movie
    static void loadMoviePosterImage(final Context context, final String imagePath, final ImageView imageView) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .tag(GlobalStaticVariables.PICASSO_POSTER_IMAGE_TAG)
                    .fit()
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }

    //To load the person poster - used for Cast Adapter, Crew Adapter, etc
    static void loadMoviePersonImage(final Context context, final String imagePath, final ImageView imageView) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .fit()
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }

    //To load the movie poster for detail fragment - used callback
    static void loadDetailFragmentPosterImage(final Context context, final String imagePath,
                                              final ImageView imageView, final Callback callback) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .fit()
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView, callback)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }

    //To load the movie poster for detail fragment viewpager adapter
    static void loadDetailFragmentPagerAdapterImage(final Context context, final String imagePath,
                                                    final ImageView imageView) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .priority(Picasso.Priority.HIGH) //Picasso will treat this as high priority
                    .fit()
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }

    //To load the collection backdrop for detail fragment
    static void loadDetailFragmentCollectionBackdropImage(final Context context, final String imagePath, final ImageView imageView) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .fit()
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }

    //To load the collection backdrop - used callback
    static void loadCollectionBackdropImage(final Context context, final String imagePath,
                                            final ImageView imageView, final Callback callback) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .fit()
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView, callback)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }

    //To load the image for ViewPage adapter - used to display full screen images
    static void loadViewPagerImage(final Context context, final String imagePath, final ImageView imageView) {
        if (Utility.isReadyToDownload(context.getApplicationContext()) && !Utility.isReducedDataOn(context)) {
            Picasso.with(context)
                    .load(imagePath)
                    .placeholder(R.drawable.image_place_holder)
                    .error(R.drawable.image_download_error)
                    .into(imageView)
        } else {
            Picasso.with(context)
                    .load(R.drawable.image_place_holder)
                    .into(imageView)
        }
    }
}