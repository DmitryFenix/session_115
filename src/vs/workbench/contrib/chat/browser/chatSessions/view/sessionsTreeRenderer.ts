	private archivedItems = new ArchivedSessionItems(nls.localize('chat.sessions.archivedSessions', 'Archived'));
	constructor(
		private readonly provider: IChatSessionItemProvider,
		private readonly sessionTracker: ChatSessionTracker,