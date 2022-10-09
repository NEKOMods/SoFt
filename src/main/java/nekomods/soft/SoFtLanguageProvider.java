package nekomods.soft;

import net.minecraftforge.forgespi.language.ILifecycleEvent;
import net.minecraftforge.forgespi.language.IModLanguageProvider;
import net.minecraftforge.forgespi.language.ModFileScanData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SoFtLanguageProvider implements IModLanguageProvider {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public String name() {
        return "SoFt";
    }

    @Override
    public Consumer<ModFileScanData> getFileVisitor() {
        return null;
    }

    @Override
    public <R extends ILifecycleEvent<R>> void consumeLifecycleEvent(Supplier<R> consumeEvent) {
        LOGGER.warn("hi hi hi");
    }
}
