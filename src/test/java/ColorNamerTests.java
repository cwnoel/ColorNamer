import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class ColorNamerTests {

    // For testing both local and AWS deployments
//    HttpPost request = new HttpPost("http://localhost:8080/ColorNamer_war_exploded/colornamer?origColor=green");
//    HttpPost request2 = new HttpPost("http://localhost:8080/ColorNamer_war/colornamer?origColor=green");
//    HttpPost request3 = new HttpPost("http://ec2-44-229-32-205.us-west-2.compute.amazonaws.com/colornamer?origColor=blue3");

    @Test(description = "Verify aqua becomes Green")
    public void test_001_aqua() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=aqua");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Blue"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify azul becomes Green")
    public void test_002_azul() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=azul");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Blue"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify turquoise becomes Green")
    public void test_003_turquoise() throws IOException {
        //verify green Becomes Green
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=turquoise");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        // Read the contents of an entity and return it as a String.
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Blue"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify blue becomes Blue")
    public void test_004_blue() throws IOException {
        //verify blue Becomes Blue
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=blue");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        // Read the contents of an entity and return it as a String.
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Blue"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify chartreuse becomes Green")
    public void test_005_chartreuse() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=chartreuse");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Green"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify moss becomes Green")
    public void test_006_moss() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=moss");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Green"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify chartreuse becomes Green")
    public void test_007_forest() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=forest");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Green"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify green becomes Green")
    public void test_008_green() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=green");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(content.contentEquals("Green"));
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 200 OK"));
        client.close();
    }

    @Test(description = "Verify 500 Error")
    public void test_009_500_Error() throws IOException {
        HttpPost request = new HttpPost("http://colornamer-env.bwufiyp3dz.us-west-2.elasticbeanstalk.com/colornamer?origColor=Hello");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 500 Internal Server Error"));
        client.close();
    }


}







