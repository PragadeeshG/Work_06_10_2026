package com.test1;

public class ParentDocRetrieverRAGEvaluation {
	private long evaluationId;
	private long parentDocRetrievalId;
	private long parentDocRetrieverConfigId;
	private String evaluationDatasetId;
	private String userQuery;
	private String expectedAnswer;
	private String generatedAnswer;
	private String expectedParentDocumentsIds;
	private String retrievedParentDocumentsIds;
	private long relevantParentDocumentsCount;
	private String retrievalPrecision;
	private String retrievalRecall;
	private String childChunkHitRate;
	private String parentDocumentHitRate;
	private String contextRelevanceScore;
	private String answerRelevanceScore;
	private String faithfulnessScore;
	private String groundednessScore;

	public ParentDocRetrieverRAGEvaluation() {

	}

	public ParentDocRetrieverRAGEvaluation(long evaluationId, long parentDocRetrievalId,
			long parentDocRetrieverConfigId, String evaluationDatasetId, String userQuery, String expectedAnswer,
			String generatedAnswer, String expectedParentDocumentsIds, String retrievedParentDocumentsIds,
			long relevantParentDocumentsCount, String retrievalPrecision, String retrievalRecall,
			String childChunkHitRate, String parentDocumentHitRate, String contextRelevanceScore,
			String answerRelevanceScore, String faithfulnessScore, String groundednessScore) {
		super();
		this.evaluationId = evaluationId;
		this.parentDocRetrievalId = parentDocRetrievalId;
		this.parentDocRetrieverConfigId = parentDocRetrieverConfigId;
		this.evaluationDatasetId = evaluationDatasetId;
		this.userQuery = userQuery;
		this.expectedAnswer = expectedAnswer;
		this.generatedAnswer = generatedAnswer;
		this.expectedParentDocumentsIds = expectedParentDocumentsIds;
		this.retrievedParentDocumentsIds = retrievedParentDocumentsIds;
		this.relevantParentDocumentsCount = relevantParentDocumentsCount;
		this.retrievalPrecision = retrievalPrecision;
		this.retrievalRecall = retrievalRecall;
		this.childChunkHitRate = childChunkHitRate;
		this.parentDocumentHitRate = parentDocumentHitRate;
		this.contextRelevanceScore = contextRelevanceScore;
		this.answerRelevanceScore = answerRelevanceScore;
		this.faithfulnessScore = faithfulnessScore;
		this.groundednessScore = groundednessScore;
	}

	public long getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(long evaluationId) {
		this.evaluationId = evaluationId;
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

	public String getEvaluationDatasetId() {
		return evaluationDatasetId;
	}

	public void setEvaluationDatasetId(String evaluationDatasetId) {
		this.evaluationDatasetId = evaluationDatasetId;
	}

	public String getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

	public String getExpectedAnswer() {
		return expectedAnswer;
	}

	public void setExpectedAnswer(String expectedAnswer) {
		this.expectedAnswer = expectedAnswer;
	}

	public String getGeneratedAnswer() {
		return generatedAnswer;
	}

	public void setGeneratedAnswer(String generatedAnswer) {
		this.generatedAnswer = generatedAnswer;
	}

	public String getExpectedParentDocumentsIds() {
		return expectedParentDocumentsIds;
	}

	public void setExpectedParentDocumentsIds(String expectedParentDocumentsIds) {
		this.expectedParentDocumentsIds = expectedParentDocumentsIds;
	}

	public String getRetrievedParentDocumentsIds() {
		return retrievedParentDocumentsIds;
	}

	public void setRetrievedParentDocumentsIds(String retrievedParentDocumentsIds) {
		this.retrievedParentDocumentsIds = retrievedParentDocumentsIds;
	}

	public long getRelevantParentDocumentsCount() {
		return relevantParentDocumentsCount;
	}

	public void setRelevantParentDocumentsCount(long relevantParentDocumentsCount) {
		this.relevantParentDocumentsCount = relevantParentDocumentsCount;
	}

	public String getRetrievalPrecision() {
		return retrievalPrecision;
	}

	public void setRetrievalPrecision(String retrievalPrecision) {
		this.retrievalPrecision = retrievalPrecision;
	}

	public String getRetrievalRecall() {
		return retrievalRecall;
	}

	public void setRetrievalRecall(String retrievalRecall) {
		this.retrievalRecall = retrievalRecall;
	}

	public String getChildChunkHitRate() {
		return childChunkHitRate;
	}

	public void setChildChunkHitRate(String childChunkHitRate) {
		this.childChunkHitRate = childChunkHitRate;
	}

	public String getParentDocumentHitRate() {
		return parentDocumentHitRate;
	}

	public void setParentDocumentHitRate(String parentDocumentHitRate) {
		this.parentDocumentHitRate = parentDocumentHitRate;
	}

	public String getContextRelevanceScore() {
		return contextRelevanceScore;
	}

	public void setContextRelevanceScore(String contextRelevanceScore) {
		this.contextRelevanceScore = contextRelevanceScore;
	}

	public String getAnswerRelevanceScore() {
		return answerRelevanceScore;
	}

	public void setAnswerRelevanceScore(String answerRelevanceScore) {
		this.answerRelevanceScore = answerRelevanceScore;
	}

	public String getFaithfulnessScore() {
		return faithfulnessScore;
	}

	public void setFaithfulnessScore(String faithfulnessScore) {
		this.faithfulnessScore = faithfulnessScore;
	}

	public String getGroundednessScore() {
		return groundednessScore;
	}

	public void setGroundednessScore(String groundednessScore) {
		this.groundednessScore = groundednessScore;
	}

}
