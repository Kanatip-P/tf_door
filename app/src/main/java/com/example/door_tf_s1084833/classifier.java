package com.example.door_tf_s1084833;

import android.graphics.Bitmap;
import android.graphics.RectF;

import androidx.annotation.NonNull;

import java.util.List;

public interface classifier {
    class Recognition{


        private  String id;
        private  String title;
        private  Float confidence;
        private RectF location;

        public Recognition(final String id, final String title, final Float confidence, RectF location) {
            this.id = id;
            this.title = title;
            this.confidence = confidence;
            this.location = location;
        }
        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public Float getConfidence() {
            return confidence;
        }
        public RectF getLocation() {
            return location;
        }
        public void setLocation(RectF location) {
            this.location = location;
        }

        @NonNull
        @Override
        public String toString() {
            String resultString = "";
            if (id != null) {
                resultString = resultString + "[" + id + "] ";
            }

            if (title != null) {
                resultString = resultString + title + " ";
            }

            if (confidence != null) {
                resultString = resultString + String.format("(%.1f%%) ", confidence * 100.0f);
            }

            return resultString.trim();
        }
    }
    List<Recognition> recognizeImage(Bitmap bitmap);

    void close();



}
