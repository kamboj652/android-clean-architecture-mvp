/*
 * Copyright (C) 2015 Pau Picas Sans <pau.picas@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package cat.ppicas.cleanarch.model;

public class City {

    private String mId;
    private String mName;
    private String mCountry;
    private CurrentWeatherPreview mCurrentWeatherPreview;

    public City(String id, String name, String country) {
        mId = id;
        mName = name;
        mCountry = country;
    }

    public City(String id, String name, String country,
            CurrentWeatherPreview currentWeatherPreview) {
        mId = id;
        mName = name;
        mCountry = country;
        mCurrentWeatherPreview = currentWeatherPreview;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getCountry() {
        return mCountry;
    }

    public CurrentWeatherPreview getCurrentWeatherPreview() {
        return mCurrentWeatherPreview;
    }
}
