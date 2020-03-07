import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

public class HelloHazelcast {

    public static void main(String[] args) {
        Config config = new Config();
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);
        Map<String, String> hazelcastMap = hazelcastInstance.getMap("rankings");
        hazelcastMap.put("Vinod", "first");
        hazelcastMap.put("Ramesh", "Second");
        hazelcastMap.put("Robert", "Third");

        System.out.println("rank of Vinod : " + hazelcastMap.get("Vinod"));

        Queue<String> queue = hazelcastInstance.getQueue("myQueue");
        queue.offer("Vinod");
        queue.offer("Ramesh");
        System.out.println("First name: " + queue.poll());
        System.out.println("Second name: " + queue.poll());

    }
}
