/**
 * PluginConfigurationFilePOJO.java
 *
 * Copyright (C) 2014
 *
 * Anderson de Oliveira Antunes <anderson.utf@gmail.com>
 *
 * This file is part of S3F.
 *
 * S3F is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * S3F is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * S3F. If not, see http://www.gnu.org/licenses/.
 */
package s3f.core.plugin;

import java.util.List;

public class PluginPOJO {

    public String name;
    public String fullName;
    public String path;
    public String langFolder;
    public String version;
    public List<String> dependencies;
    public List<String> content;
    public String builder;
    public String guibuilder;
    public Boolean platform;
    public Boolean extension;
    public Boolean pack;
    public List<String> nativeLibs;
}
