import org.bukkit.plugin.java.JavaPlugin;

public class Placeholders extends JavaPlugin {

    private static Placeholders instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        //
    }

    public static Placeholders get() {
        return instance;
    }
}
