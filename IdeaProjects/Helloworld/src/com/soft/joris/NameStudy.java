package com.soft.joris;

import java.util.Objects;

public class NameStudy {
    private int servings;
    private int serviceingsSize;
    private int fat;
    private int sodium;
    private int calories;
    private int size;
    private int pages;



    public static class Builder {
        private int servings;
        private int serviceingsSize;
        private int fat;
        private int sodium;
        private int calories;
        private int size;
        private int pages;

        public Builder(int servings, int serviceingsSize) {
            this.servings = servings;
            this.serviceingsSize = serviceingsSize;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder size(int val) {
            size = val;
            return this;
        }

        public Builder pages(int val) {
            pages = val;
            return this;
        }

        public NameStudy build() {
            return new NameStudy(this);
        }
    }

    private  NameStudy(Builder builder){
        servings =  builder.servings;
        serviceingsSize =  builder.serviceingsSize;
        fat =  builder.fat;
        sodium =  builder.sodium;
        calories =  builder.calories;
        size =  builder.size;
        pages =  builder.pages;
    }

    @Override
    public String toString() {
        return "NameStudy{" +
                "servings=" + servings +
                ", serviceingsSize=" + serviceingsSize +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", calories=" + calories +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NameStudy)) return false;
        NameStudy nameStudy = (NameStudy) o;
        return servings == nameStudy.servings &&
                serviceingsSize == nameStudy.serviceingsSize &&
                fat == nameStudy.fat &&
                sodium == nameStudy.sodium &&
                calories == nameStudy.calories &&
                size == nameStudy.size &&
                pages == nameStudy.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(servings, serviceingsSize, fat, sodium, calories, size, pages);
    }
}
