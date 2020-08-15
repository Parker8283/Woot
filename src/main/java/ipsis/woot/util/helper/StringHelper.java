package ipsis.woot.util.helper;


import net.minecraft.util.text.LanguageMap;

public class StringHelper {

    public static String translate(String key) {
        return LanguageMap.getInstance().get(key);
    }

    public static String translateFormat(String key, Object... format) {
        return String.format(LanguageMap.getInstance().get(key), format);
    }
}
