import java.io.IOException;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.request.UpdateRequest;

public class DeleteAllRecords {
	public static void main(String[] args) throws SolrServerException, IOException {
		
		HttpSolrServer server = new HttpSolrServer("http://localhost:8983/solr/Music");


		UpdateRequest update = new UpdateRequest();
		update.deleteByQuery("*:*");
		update.setCommitWithin(0);
		server.request(update);
		server.commit(true, true);
	}
}
