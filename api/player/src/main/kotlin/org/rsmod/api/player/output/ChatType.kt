package org.rsmod.api.player.output

public enum class ChatType(public val id: Int) {
    GameMessage(0),
    ModChat(1),
    PublicChat(2),
    PrivateChat(3),
    Engine(4),
    LoginLogoutNotification(5),
    PrivateChatOut(6),
    ModPrivateChat(7),
    FriendsChat(9),
    FriendsChatNotification(11),
    Broadcast(14),
    SnapshotFeedback(26),
    ObjExamine(27),
    NpcExamine(28),
    LocExamine(29),
    FriendNotification(30),
    IgnoreNotification(31),
    ClanChat(41),
    ClanMessage(43),
    ClanGuestChat(44),
    ClanGuestMessage(46),
    AutoTyper(90),
    ModAutoTyper(91),
    Console(99),
    TradeReq(101),
    Trade(102),
    ChalReqTrade(103),
    ChalReqFriendsChat(104),
    Spam(105),
    PlayerRelated(106),
    TenSecTimeout(107),
    Welcome(108),
    ClanCreationInvitation(109),
    ClanWarsChallenge(110),
    GimFormGroup(111),
    GimGroupWith(112),
    Dialogue(114),
    Mesbox(115),
}
