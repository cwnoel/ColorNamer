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
    String request1 = "http://localhost:8080/ColorNamer_war_exploded/colornamer?origColor=";
    String request2 = "http://localhost:8080/ColorNamer_war/colornamer?origColor=";
    String request3 = "http://ec2-52-32-3-44.us-west-2.compute.amazonaws.com/colornamer?origColor=";
    String request4 = "http://Colornamer-env-1.g8svmtmvgs.us-west-2.elasticbeanstalk.com/colornamer?origColor=";


    @Test(description = "Verify aqua becomes Blue")
    public void test_001_aqua() throws IOException {
        HttpPost request = new HttpPost(request4 +"aqua");
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

    @Test(description = "Verify azul becomes Blue")
    public void test_002_azul() throws IOException {
        HttpPost request = new HttpPost(request4 + "azul");
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

    @Test(description = "Verify turquoise becomes Blue")
    public void test_003_turquoise() throws IOException {
        HttpPost request = new HttpPost(request4 + "turquoise");
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

    @Test(description = "Verify blue becomes Blue")
    public void test_004_blue() throws IOException {
        HttpPost request = new HttpPost(request4 +"blue");
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

    @Test(description = "Verify chartreuse becomes Green")
    public void test_005_chartreuse() throws IOException {
        HttpPost request = new HttpPost(request4 + "chartreuse");
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
        HttpPost request = new HttpPost(request4 + "moss");
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
        HttpPost request = new HttpPost(request4 + "forest");
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
        HttpPost request = new HttpPost(request4 + "green");
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

    @Test(description = "Verify 500 Error with unsupported color")
    public void test_009_500_Error() throws IOException {
        HttpPost request = new HttpPost(request4 + "yellow");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 500 Internal Server Error"));
        client.close();
    }

    @Test(description = "Verify 500 Error with Null data")
    public void test_010_500_Error() throws IOException {
        HttpPost request = new HttpPost(request4);
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 500 Internal Server Error"));
        client.close();
    }
    //there is no DB involved so not a really great test....this one will fail as it causes an error in the function call
    @Test(description = "Verify 500 Error with injection attempt")
    public void test_011_500_Error() throws IOException {
        HttpPost request = new HttpPost(request4 + "'or 1=1;-");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(response.getStatusLine());
        Assert.assertTrue(response.getStatusLine().toString().contentEquals("HTTP/1.1 500 Internal Server Error"));
        client.close();
    }
    //one very basic performance test
    @Test(description = "Verify api response time is < 100ms>")
    public void test_012_API_Response_Time() throws IOException {
        HttpPost request = new HttpPost(request4 + "green");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        long startTime = System.currentTimeMillis();
        CloseableHttpResponse response = client.execute(request);
        long elapsedTime = System.currentTimeMillis() - startTime;
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(response.getStatusLine());
        System.out.println("Total elapsed http request/response time in milliseconds: " + elapsedTime);
        Assert.assertTrue(elapsedTime < 100);
        client.close();
    }


}









