package veeva.java.a;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentPaginationTest {

    @Test
    public void testDocumentPagination() {
        DocumentPagination solution = new DocumentPagination();
        
        List<DocumentPagination.Document> docs = Arrays.asList(
            new DocumentPagination.Document(1, 100, "DRAFT", 1000L),
            new DocumentPagination.Document(2, 100, "APPROVED", 2000L),
            new DocumentPagination.Document(3, 100, "DRAFT", 3000L),
            new DocumentPagination.Document(4, 200, "DRAFT", 4000L),
            new DocumentPagination.Document(5, 100, "APPROVED", 5000L)
        );

        // Filter by tenantId=100, no status filter, sort asc, page=1, size=2
        List<DocumentPagination.Document> page1 = solution.getPage(docs, 100, null, true, 1, 2);
        assertNotNull(page1);
        assertEquals(2, page1.size());
        assertEquals(1, page1.get(0).id);
        assertEquals(2, page1.get(1).id);

        // Filter by tenantId=100, status="DRAFT", sort desc, page=1, size=10
        List<DocumentPagination.Document> draftDesc = solution.getPage(docs, 100, "DRAFT", false, 1, 10);
        assertNotNull(draftDesc);
        assertEquals(2, draftDesc.size());
        assertEquals(3, draftDesc.get(0).id);
        assertEquals(1, draftDesc.get(1).id);
    }
}
