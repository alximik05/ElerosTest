import com.eleronTest.model.Sensor;
import com.eleronTest.model.VerificationDevice;
import com.eleronTest.model.VerificationDeviceType;
import com.eleronTest.store.DeviceStore;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class DeviceStoreTest {

    DeviceStore store = new DeviceStore();
    VerificationDevice device = new VerificationDevice(1, "first", "aes", VerificationDeviceType.ADVANCE);
    VerificationDevice device2 = new VerificationDevice(2, "second", "aes", VerificationDeviceType.SIMPLE);
    Sensor sensor = new Sensor(3, "first", "aes", true);
    Sensor sensor2 = new Sensor(4, "second", "aes", false);
    @Before
    public void before() {


        store.clearAll();

        store.save(device);
        store.save(device2);
        store.save(sensor);
        store.save(sensor2);

    }

    @org.junit.Test
    public void testSave() throws Exception {
        assertEquals(4, store.size());
    }

    @org.junit.Test
    public void testDelete() throws Exception {
        store.delete(1);
        assertEquals(3, store.size());
    }


    @org.junit.Test
    public void testClearAll() throws Exception {
        store.clearAll();
        assertEquals(0, store.size());
    }

    @org.junit.Test
    public void testGet() throws Exception {
        assertEquals(device, store.get(1));
    }
}