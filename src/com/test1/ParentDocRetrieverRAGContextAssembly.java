package com.test1;

public class ParentDocRetrieverRAGContextAssembly {
	private long contextAssemblyId;
	private long parentDocRetrievalId;
	private long parentDocRetrieverConfigId;
	private String sessionId;
	private String matchedChildChunks;
	private String selectedParentDocuments;
	private long parentDocumentCount;
	private long childChunkCount;
	private String contextSelectionStrategy;
	private String parentExpansionStrategy;
	private String rerankingApplied;
	private String contextDeduplicationEnabled;
	private long originalContextTokenCount;
	private long finalContextTokenCount;
	private long maximumContextTokens;
	private String contextTruncated;
	private String assembledContext;

	public ParentDocRetrieverRAGContextAssembly() {

	}

	public ParentDocRetrieverRAGContextAssembly(long contextAssemblyId, long parentDocRetrievalId,
			long parentDocRetrieverConfigId, String sessionId, String matchedChildChunks,
			String selectedParentDocuments, long parentDocumentCount, long childChunkCount,
			String contextSelectionStrategy, String parentExpansionStrategy, String rerankingApplied,
			String contextDeduplicationEnabled, long originalContextTokenCount, long finalContextTokenCount,
			long maximumContextTokens, String contextTruncated, String assembledContext) {
		super();
		this.contextAssemblyId = contextAssemblyId;
		this.parentDocRetrievalId = parentDocRetrievalId;
		this.parentDocRetrieverConfigId = parentDocRetrieverConfigId;
		this.sessionId = sessionId;
		this.matchedChildChunks = matchedChildChunks;
		this.selectedParentDocuments = selectedParentDocuments;
		this.parentDocumentCount = parentDocumentCount;
		this.childChunkCount = childChunkCount;
		this.contextSelectionStrategy = contextSelectionStrategy;
		this.parentExpansionStrategy = parentExpansionStrategy;
		this.rerankingApplied = rerankingApplied;
		this.contextDeduplicationEnabled = contextDeduplicationEnabled;
		this.originalContextTokenCount = originalContextTokenCount;
		this.finalContextTokenCount = finalContextTokenCount;
		this.maximumContextTokens = maximumContextTokens;
		this.contextTruncated = contextTruncated;
		this.assembledContext = assembledContext;
	}

	public long getContextAssemblyId() {
		return contextAssemblyId;
	}

	public void setContextAssemblyId(long contextAssemblyId) {
		this.contextAssemblyId = contextAssemblyId;
	}

	public long getParentDocRetrievalId() {
		return parentDocRetrievalId;
	}

	public void setParentDocRetrievalId(long parentDocRetrievalId) {
		this.parentDocRetrievalId = parentDocRetrievalId;
	}

	public long getParentDocRetrieverConfigId() {
		return parentDocRetrieverConfigId;
	}

	public void setParentDocRetrieverConfigId(long parentDocRetrieverConfigId) {
		this.parentDocRetrieverConfigId = parentDocRetrieverConfigId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getMatchedChildChunks() {
		return matchedChildChunks;
	}

	public void setMatchedChildChunks(String matchedChildChunks) {
		this.matchedChildChunks = matchedChildChunks;
	}

	public String getSelectedParentDocuments() {
		return selectedParentDocuments;
	}

	public void setSelectedParentDocuments(String selectedParentDocuments) {
		this.selectedParentDocuments = selectedParentDocuments;
	}

	public long getParentDocumentCount() {
		return parentDocumentCount;
	}

	public void setParentDocumentCount(long parentDocumentCount) {
		this.parentDocumentCount = parentDocumentCount;
	}

	public long getChildChunkCount() {
		return childChunkCount;
	}

	public void setChildChunkCount(long childChunkCount) {
		this.childChunkCount = childChunkCount;
	}

	public String getContextSelectionStrategy() {
		return contextSelectionStrategy;
	}

	public void setContextSelectionStrategy(String contextSelectionStrategy) {
		this.contextSelectionStrategy = contextSelectionStrategy;
	}

	public String getParentExpansionStrategy() {
		return parentExpansionStrategy;
	}

	public void setParentExpansionStrategy(String parentExpansionStrategy) {
		this.parentExpansionStrategy = parentExpansionStrategy;
	}

	public String getRerankingApplied() {
		return rerankingApplied;
	}

	public void setRerankingApplied(String rerankingApplied) {
		this.rerankingApplied = rerankingApplied;
	}

	public String getContextDeduplicationEnabled() {
		return contextDeduplicationEnabled;
	}

	public void setContextDeduplicationEnabled(String contextDeduplicationEnabled) {
		this.contextDeduplicationEnabled = contextDeduplicationEnabled;
	}

	public long getOriginalContextTokenCount() {
		return originalContextTokenCount;
	}

	public void setOriginalContextTokenCount(long originalContextTokenCount) {
		this.originalContextTokenCount = originalContextTokenCount;
	}

	public long getFinalContextTokenCount() {
		return finalContextTokenCount;
	}

	public void setFinalContextTokenCount(long finalContextTokenCount) {
		this.finalContextTokenCount = finalContextTokenCount;
	}

	public long getMaximumContextTokens() {
		return maximumContextTokens;
	}

	public void setMaximumContextTokens(long maximumContextTokens) {
		this.maximumContextTokens = maximumContextTokens;
	}

	public String getContextTruncated() {
		return contextTruncated;
	}

	public void setContextTruncated(String contextTruncated) {
		this.contextTruncated = contextTruncated;
	}

	public String getAssembledContext() {
		return assembledContext;
	}

	public void setAssembledContext(String assembledContext) {
		this.assembledContext = assembledContext;
	}

}
