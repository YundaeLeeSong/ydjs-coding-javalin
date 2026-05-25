package veeva.java.a;

import java.util.List;

/**
 * Question 1: Document Pagination and Filtering (System Logic)
 * 
 * Implement a function that takes a list of "Document" objects (fields: id, 
 * tenantId, status, createdAt) and returns a specific "page" of results.
 * 
 * Constraints:
 * - Filter by tenantId (Required).
 * - Filter by status (Optional - if null or empty, don't filter by status).
 * - Sort by createdAt (Ascending or Descending).
 * - Implement pagination logic using pageNumber (1-based) and pageSize.
 */
public class DocumentPagination {

    public static class Document {
        public int id;
        public int tenantId;
        public String status;
        public long createdAt;

        public Document(int id, int tenantId, String status, long createdAt) {
            this.id = id;
            this.tenantId = tenantId;
            this.status = status;
            this.createdAt = createdAt;
        }
    }

    public List<Document> getPage(
            List<Document> documents,
            int tenantId,
            String status,
            boolean sortAscending,
            int pageNumber,
            int pageSize) {
        
        return documents.stream()
                .filter(d -> d.tenantId == tenantId)
                .filter(d -> status == null || status.isEmpty() || status.equals(d.status))
                .sorted((d1, d2) -> {
                    int compare = Long.compare(d1.createdAt, d2.createdAt);
                    return sortAscending ? compare : -compare;
                })
                .skip((pageNumber - 1L) * pageSize)
                .limit(pageSize)
                .collect(java.util.stream.Collectors.toList());
    }
}


