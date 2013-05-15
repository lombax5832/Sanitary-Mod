package Sanitary.core.config;

import java.io.File;

import Sanitary.lib.Constants;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class SanitaryConfiguration extends Configuration{
    
    public SanitaryConfiguration(File file) {
        super(file);
    }

    @Override
    public void save() {
        Property versionProp = get(CATEGORY_GENERAL, "version", Constants.VERSION);
        versionProp.set(Constants.VERSION);
        super.save();
    }
}