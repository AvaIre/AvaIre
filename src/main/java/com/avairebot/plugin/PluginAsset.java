/*
 * Copyright (c) 2019.
 *
 * This file is part of AvaIre.
 *
 * AvaIre is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AvaIre is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AvaIre.  If not, see <https://www.gnu.org/licenses/>.
 *
 *
 */

package com.avairebot.plugin;

import org.json.JSONObject;

public class PluginAsset {

    private final String name;
    private final String downloadableUrl;

    public PluginAsset(JSONObject object) {
        name = object.getString("name");
        downloadableUrl = object.getString("browser_download_url");
    }

    public String getName() {
        return name;
    }

    public String getDownloadableUrl() {
        return downloadableUrl;
    }
}
