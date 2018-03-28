package org.zstack.zql.ast.visitors.result

import org.zstack.zql.ast.ZQLMetadata

class QueryResult {
    String sql
    ZQLMetadata.InventoryMetadata inventoryMetadata
    ReturnWithResult returnWith
    List<FilterByResult> filterBy
}
