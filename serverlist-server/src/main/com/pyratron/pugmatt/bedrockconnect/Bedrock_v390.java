package main.com.pyratron.pugmatt.bedrockconnect;

import com.nukkitx.protocol.bedrock.BedrockPacketCodec;
import com.nukkitx.protocol.bedrock.packet.AddBehaviorTreePacket;
import com.nukkitx.protocol.bedrock.packet.AddEntityPacket;
import com.nukkitx.protocol.bedrock.packet.AddItemEntityPacket;
import com.nukkitx.protocol.bedrock.packet.AddPaintingPacket;
import com.nukkitx.protocol.bedrock.packet.AddPlayerPacket;
import com.nukkitx.protocol.bedrock.packet.AdventureSettingsPacket;
import com.nukkitx.protocol.bedrock.packet.AnimatePacket;
import com.nukkitx.protocol.bedrock.packet.AnvilDamagePacket;
import com.nukkitx.protocol.bedrock.packet.AutomationClientConnectPacket;
import com.nukkitx.protocol.bedrock.packet.AvailableCommandsPacket;
import com.nukkitx.protocol.bedrock.packet.AvailableEntityIdentifiersPacket;
import com.nukkitx.protocol.bedrock.packet.BiomeDefinitionListPacket;
import com.nukkitx.protocol.bedrock.packet.BlockEntityDataPacket;
import com.nukkitx.protocol.bedrock.packet.BlockEventPacket;
import com.nukkitx.protocol.bedrock.packet.BlockPickRequestPacket;
import com.nukkitx.protocol.bedrock.packet.BookEditPacket;
import com.nukkitx.protocol.bedrock.packet.BossEventPacket;
import com.nukkitx.protocol.bedrock.packet.CameraPacket;
import com.nukkitx.protocol.bedrock.packet.ChangeDimensionPacket;
import com.nukkitx.protocol.bedrock.packet.ChunkRadiusUpdatedPacket;
import com.nukkitx.protocol.bedrock.packet.ClientCacheBlobStatusPacket;
import com.nukkitx.protocol.bedrock.packet.ClientCacheMissResponsePacket;
import com.nukkitx.protocol.bedrock.packet.ClientCacheStatusPacket;
import com.nukkitx.protocol.bedrock.packet.ClientToServerHandshakePacket;
import com.nukkitx.protocol.bedrock.packet.ClientboundMapItemDataPacket;
import com.nukkitx.protocol.bedrock.packet.CommandBlockUpdatePacket;
import com.nukkitx.protocol.bedrock.packet.CommandOutputPacket;
import com.nukkitx.protocol.bedrock.packet.CommandRequestPacket;
import com.nukkitx.protocol.bedrock.packet.CompletedUsingItemPacket;
import com.nukkitx.protocol.bedrock.packet.ContainerClosePacket;
import com.nukkitx.protocol.bedrock.packet.ContainerOpenPacket;
import com.nukkitx.protocol.bedrock.packet.ContainerSetDataPacket;
import com.nukkitx.protocol.bedrock.packet.CraftingDataPacket;
import com.nukkitx.protocol.bedrock.packet.CraftingEventPacket;
import com.nukkitx.protocol.bedrock.packet.DisconnectPacket;
import com.nukkitx.protocol.bedrock.packet.EducationSettingsPacket;
import com.nukkitx.protocol.bedrock.packet.EmotePacket;
import com.nukkitx.protocol.bedrock.packet.EntityEventPacket;
import com.nukkitx.protocol.bedrock.packet.EntityFallPacket;
import com.nukkitx.protocol.bedrock.packet.EntityPickRequestPacket;
import com.nukkitx.protocol.bedrock.packet.EventPacket;
import com.nukkitx.protocol.bedrock.packet.GameRulesChangedPacket;
import com.nukkitx.protocol.bedrock.packet.GuiDataPickItemPacket;
import com.nukkitx.protocol.bedrock.packet.HurtArmorPacket;
import com.nukkitx.protocol.bedrock.packet.InteractPacket;
import com.nukkitx.protocol.bedrock.packet.InventoryContentPacket;
import com.nukkitx.protocol.bedrock.packet.InventorySlotPacket;
import com.nukkitx.protocol.bedrock.packet.InventoryTransactionPacket;
import com.nukkitx.protocol.bedrock.packet.ItemFrameDropItemPacket;
import com.nukkitx.protocol.bedrock.packet.LabTablePacket;
import com.nukkitx.protocol.bedrock.packet.LecternUpdatePacket;
import com.nukkitx.protocol.bedrock.packet.LevelChunkPacket;
import com.nukkitx.protocol.bedrock.packet.LevelEventGenericPacket;
import com.nukkitx.protocol.bedrock.packet.LevelEventPacket;
import com.nukkitx.protocol.bedrock.packet.LevelSoundEvent1Packet;
import com.nukkitx.protocol.bedrock.packet.LevelSoundEvent2Packet;
import com.nukkitx.protocol.bedrock.packet.LevelSoundEventPacket;
import com.nukkitx.protocol.bedrock.packet.LoginPacket;
import com.nukkitx.protocol.bedrock.packet.MapCreateLockedCopyPacket;
import com.nukkitx.protocol.bedrock.packet.MapInfoRequestPacket;
import com.nukkitx.protocol.bedrock.packet.MobArmorEquipmentPacket;
import com.nukkitx.protocol.bedrock.packet.MobEffectPacket;
import com.nukkitx.protocol.bedrock.packet.MobEquipmentPacket;
import com.nukkitx.protocol.bedrock.packet.ModalFormRequestPacket;
import com.nukkitx.protocol.bedrock.packet.ModalFormResponsePacket;
import com.nukkitx.protocol.bedrock.packet.MoveEntityAbsolutePacket;
import com.nukkitx.protocol.bedrock.packet.MoveEntityDeltaPacket;
import com.nukkitx.protocol.bedrock.packet.MovePlayerPacket;
import com.nukkitx.protocol.bedrock.packet.MultiplayerSettingsPacket;
import com.nukkitx.protocol.bedrock.packet.NetworkChunkPublisherUpdatePacket;
import com.nukkitx.protocol.bedrock.packet.NetworkSettingsPacket;
import com.nukkitx.protocol.bedrock.packet.NetworkStackLatencyPacket;
import com.nukkitx.protocol.bedrock.packet.NpcRequestPacket;
import com.nukkitx.protocol.bedrock.packet.OnScreenTextureAnimationPacket;
import com.nukkitx.protocol.bedrock.packet.PhotoTransferPacket;
import com.nukkitx.protocol.bedrock.packet.PlaySoundPacket;
import com.nukkitx.protocol.bedrock.packet.PlayStatusPacket;
import com.nukkitx.protocol.bedrock.packet.PlayerActionPacket;
import com.nukkitx.protocol.bedrock.packet.PlayerAuthInputPacket;
import com.nukkitx.protocol.bedrock.packet.PlayerHotbarPacket;
import com.nukkitx.protocol.bedrock.packet.PlayerInputPacket;
import com.nukkitx.protocol.bedrock.packet.PlayerListPacket;
import com.nukkitx.protocol.bedrock.packet.PlayerSkinPacket;
import com.nukkitx.protocol.bedrock.packet.PurchaseReceiptPacket;
import com.nukkitx.protocol.bedrock.packet.RemoveEntityPacket;
import com.nukkitx.protocol.bedrock.packet.RemoveObjectivePacket;
import com.nukkitx.protocol.bedrock.packet.RequestChunkRadiusPacket;
import com.nukkitx.protocol.bedrock.packet.ResourcePackChunkDataPacket;
import com.nukkitx.protocol.bedrock.packet.ResourcePackChunkRequestPacket;
import com.nukkitx.protocol.bedrock.packet.ResourcePackClientResponsePacket;
import com.nukkitx.protocol.bedrock.packet.ResourcePackDataInfoPacket;
import com.nukkitx.protocol.bedrock.packet.ResourcePackStackPacket;
import com.nukkitx.protocol.bedrock.packet.ResourcePacksInfoPacket;
import com.nukkitx.protocol.bedrock.packet.RespawnPacket;
import com.nukkitx.protocol.bedrock.packet.RiderJumpPacket;
import com.nukkitx.protocol.bedrock.packet.ScriptCustomEventPacket;
import com.nukkitx.protocol.bedrock.packet.ServerSettingsRequestPacket;
import com.nukkitx.protocol.bedrock.packet.ServerSettingsResponsePacket;
import com.nukkitx.protocol.bedrock.packet.ServerToClientHandshakePacket;
import com.nukkitx.protocol.bedrock.packet.SetCommandsEnabledPacket;
import com.nukkitx.protocol.bedrock.packet.SetDefaultGameTypePacket;
import com.nukkitx.protocol.bedrock.packet.SetDifficultyPacket;
import com.nukkitx.protocol.bedrock.packet.SetDisplayObjectivePacket;
import com.nukkitx.protocol.bedrock.packet.SetEntityDataPacket;
import com.nukkitx.protocol.bedrock.packet.SetEntityLinkPacket;
import com.nukkitx.protocol.bedrock.packet.SetEntityMotionPacket;
import com.nukkitx.protocol.bedrock.packet.SetHealthPacket;
import com.nukkitx.protocol.bedrock.packet.SetLastHurtByPacket;
import com.nukkitx.protocol.bedrock.packet.SetLocalPlayerAsInitializedPacket;
import com.nukkitx.protocol.bedrock.packet.SetPlayerGameTypePacket;
import com.nukkitx.protocol.bedrock.packet.SetScorePacket;
import com.nukkitx.protocol.bedrock.packet.SetScoreboardIdentityPacket;
import com.nukkitx.protocol.bedrock.packet.SetSpawnPositionPacket;
import com.nukkitx.protocol.bedrock.packet.SetTimePacket;
import com.nukkitx.protocol.bedrock.packet.SetTitlePacket;
import com.nukkitx.protocol.bedrock.packet.SettingsCommandPacket;
import com.nukkitx.protocol.bedrock.packet.ShowCreditsPacket;
import com.nukkitx.protocol.bedrock.packet.ShowProfilePacket;
import com.nukkitx.protocol.bedrock.packet.ShowStoreOfferPacket;
import com.nukkitx.protocol.bedrock.packet.SimpleEventPacket;
import com.nukkitx.protocol.bedrock.packet.SpawnExperienceOrbPacket;
import com.nukkitx.protocol.bedrock.packet.SpawnParticleEffectPacket;
import com.nukkitx.protocol.bedrock.packet.StartGamePacket;
import com.nukkitx.protocol.bedrock.packet.StopSoundPacket;
import com.nukkitx.protocol.bedrock.packet.StructureBlockUpdatePacket;
import com.nukkitx.protocol.bedrock.packet.StructureTemplateDataExportRequestPacket;
import com.nukkitx.protocol.bedrock.packet.StructureTemplateDataExportResponsePacket;
import com.nukkitx.protocol.bedrock.packet.SubClientLoginPacket;
import com.nukkitx.protocol.bedrock.packet.TakeItemEntityPacket;
import com.nukkitx.protocol.bedrock.packet.TextPacket;
import com.nukkitx.protocol.bedrock.packet.TickSyncPacket;
import com.nukkitx.protocol.bedrock.packet.TransferPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateAttributesPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateBlockPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateBlockPropertiesPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateBlockSyncedPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateEquipPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateSoftEnumPacket;
import com.nukkitx.protocol.bedrock.packet.UpdateTradePacket;
import com.nukkitx.protocol.bedrock.packet.VideoStreamConnectPacket;
import com.nukkitx.protocol.bedrock.v388.serializer.AddBehaviorTreeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AddEntitySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AddItemEntitySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AddPaintingSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AddPlayerSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AdventureSettingsSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AnimateSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AnvilDamageSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AutomationClientConnectSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AvailableCommandsSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.AvailableEntityIdentifiersSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.BiomeDefinitionListSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.BlockEntityDataSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.BlockEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.BlockPickRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.BookEditSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.BossEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CameraSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ChangeDimensionSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ChunkRadiusUpdatedSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ClientCacheBlobStatusSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ClientCacheMissResponseSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ClientCacheStatusSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ClientToServerHandshakeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ClientboundMapItemDataSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CommandBlockUpdateSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CommandOutputSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CommandRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CompletedUsingItemSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ContainerCloseSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ContainerOpenSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ContainerSetDataSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CraftingDataSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.CraftingEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.DisconnectSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.EducationSettingsSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.EmoteSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.EntityEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.EntityFallSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.EntityPickRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.GameRulesChangedSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.GuiDataPickItemSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.HurtArmorSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.InteractSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.InventoryContentSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.InventorySlotSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.InventoryTransactionSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ItemFrameDropItemSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LabTableSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LecternUpdateSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LevelChunkSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LevelEventGenericSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LevelEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LevelSoundEvent1Serializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LevelSoundEvent2Serializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LevelSoundEvent3Serializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.LoginSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MapCreateLockedCopySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MapInfoRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MobArmorEquipmentSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MobEffectSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MobEquipmentSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ModalFormRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ModalFormResponseSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MoveEntityAbsoluteSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MoveEntityDeltaSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MovePlayerSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.MultiplayerSettingsSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.NetworkChunkPublisherUpdateSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.NetworkSettingsSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.NetworkStackLatencySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.NpcRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.OnScreenTextureAnimationSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PacketHeaderSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PhotoTransferSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlaySoundSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayStatusSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayerActionSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayerAuthInputSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayerHotbarSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayerInputSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayerListSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PlayerSkinSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.PurchaseReceiptSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.RemoveEntitySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.RemoveObjectiveSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.RequestChunkRadiusSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ResourcePackChunkDataSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ResourcePackChunkRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ResourcePackClientResponseSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ResourcePackDataInfoSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ResourcePackStackSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ResourcePacksInfoSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.RespawnSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.RiderJumpSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ScriptCustomEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ServerSettingsRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ServerSettingsResponseSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ServerToClientHandshakeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetCommandsEnabledSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetDefaultGameTypeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetDifficultySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetDisplayObjectiveSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetEntityDataSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetEntityLinkSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetEntityMotionSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetHealthSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetLastHurtBySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetLocalPlayerAsInitializedSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetPlayerGameTypeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetScoreSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetScoreboardIdentitySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetSpawnPositionSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetTimeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SetTitleSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SettingsCommandSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ShowCreditsSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ShowProfileSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.ShowStoreOfferSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SimpleEventSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SpawnExperienceOrbSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SpawnParticleEffectSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.StartGameSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.StopSoundSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.StructureBlockUpdateSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.StructureTemplateDataExportRequestSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.StructureTemplateDataExportResponseSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.SubClientLoginSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.TakeItemEntitySerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.TextSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.TickSyncSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.TransferSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateAttributesSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateBlockPropertiesSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateBlockSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateBlockSyncedSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateEquipSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateSoftEnumSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.UpdateTradeSerializer_v388;
import com.nukkitx.protocol.bedrock.v388.serializer.VideoStreamConnectSerializer_v388;
import com.nukkitx.protocol.bedrock.v389.serializer.EventSerializer_v389;

public final class Bedrock_v390 {
    public static BedrockPacketCodec V390_CODEC;

    private Bedrock_v390() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        V390_CODEC = BedrockPacketCodec.builder().protocolVersion(390).minecraftVersion("1.14.0").headerSerializer(PacketHeaderSerializer_v388.INSTANCE).registerPacket(LoginPacket.class, LoginSerializer_v388.INSTANCE, 1).registerPacket(PlayStatusPacket.class, PlayStatusSerializer_v388.INSTANCE, 2).registerPacket(ServerToClientHandshakePacket.class, ServerToClientHandshakeSerializer_v388.INSTANCE, 3).registerPacket(ClientToServerHandshakePacket.class, ClientToServerHandshakeSerializer_v388.INSTANCE, 4).registerPacket(DisconnectPacket.class, DisconnectSerializer_v388.INSTANCE, 5).registerPacket(ResourcePacksInfoPacket.class, ResourcePacksInfoSerializer_v388.INSTANCE, 6).registerPacket(ResourcePackStackPacket.class, ResourcePackStackSerializer_v388.INSTANCE, 7).registerPacket(ResourcePackClientResponsePacket.class, ResourcePackClientResponseSerializer_v388.INSTANCE, 8).registerPacket(TextPacket.class, TextSerializer_v388.INSTANCE, 9).registerPacket(SetTimePacket.class, SetTimeSerializer_v388.INSTANCE, 10).registerPacket(StartGamePacket.class, StartGameSerializer_v388.INSTANCE, 11).registerPacket(AddPlayerPacket.class, AddPlayerSerializer_v388.INSTANCE, 12).registerPacket(AddEntityPacket.class, AddEntitySerializer_v388.INSTANCE, 13).registerPacket(RemoveEntityPacket.class, RemoveEntitySerializer_v388.INSTANCE, 14).registerPacket(AddItemEntityPacket.class, AddItemEntitySerializer_v388.INSTANCE, 15).registerPacket(TakeItemEntityPacket.class, TakeItemEntitySerializer_v388.INSTANCE, 17).registerPacket(MoveEntityAbsolutePacket.class, MoveEntityAbsoluteSerializer_v388.INSTANCE, 18).registerPacket(MovePlayerPacket.class, MovePlayerSerializer_v388.INSTANCE, 19).registerPacket(RiderJumpPacket.class, RiderJumpSerializer_v388.INSTANCE, 20).registerPacket(UpdateBlockPacket.class, UpdateBlockSerializer_v388.INSTANCE, 21).registerPacket(AddPaintingPacket.class, AddPaintingSerializer_v388.INSTANCE, 22).registerPacket(TickSyncPacket.class, TickSyncSerializer_v388.INSTANCE, 23).registerPacket(LevelSoundEvent1Packet.class, LevelSoundEvent1Serializer_v388.INSTANCE, 24).registerPacket(LevelEventPacket.class, LevelEventSerializer_v388.INSTANCE, 25).registerPacket(BlockEventPacket.class, BlockEventSerializer_v388.INSTANCE, 26).registerPacket(EntityEventPacket.class, EntityEventSerializer_v388.INSTANCE, 27).registerPacket(MobEffectPacket.class, MobEffectSerializer_v388.INSTANCE, 28).registerPacket(UpdateAttributesPacket.class, UpdateAttributesSerializer_v388.INSTANCE, 29).registerPacket(InventoryTransactionPacket.class, InventoryTransactionSerializer_v388.INSTANCE, 30).registerPacket(MobEquipmentPacket.class, MobEquipmentSerializer_v388.INSTANCE, 31).registerPacket(MobArmorEquipmentPacket.class, MobArmorEquipmentSerializer_v388.INSTANCE, 32).registerPacket(InteractPacket.class, InteractSerializer_v388.INSTANCE, 33).registerPacket(BlockPickRequestPacket.class, BlockPickRequestSerializer_v388.INSTANCE, 34).registerPacket(EntityPickRequestPacket.class, EntityPickRequestSerializer_v388.INSTANCE, 35).registerPacket(PlayerActionPacket.class, PlayerActionSerializer_v388.INSTANCE, 36).registerPacket(EntityFallPacket.class, EntityFallSerializer_v388.INSTANCE, 37).registerPacket(HurtArmorPacket.class, HurtArmorSerializer_v388.INSTANCE, 38).registerPacket(SetEntityDataPacket.class, SetEntityDataSerializer_v388.INSTANCE, 39).registerPacket(SetEntityMotionPacket.class, SetEntityMotionSerializer_v388.INSTANCE, 40).registerPacket(SetEntityLinkPacket.class, SetEntityLinkSerializer_v388.INSTANCE, 41).registerPacket(SetHealthPacket.class, SetHealthSerializer_v388.INSTANCE, 42).registerPacket(SetSpawnPositionPacket.class, SetSpawnPositionSerializer_v388.INSTANCE, 43).registerPacket(AnimatePacket.class, AnimateSerializer_v388.INSTANCE, 44).registerPacket(RespawnPacket.class, RespawnSerializer_v388.INSTANCE, 45).registerPacket(ContainerOpenPacket.class, ContainerOpenSerializer_v388.INSTANCE, 46).registerPacket(ContainerClosePacket.class, ContainerCloseSerializer_v388.INSTANCE, 47).registerPacket(PlayerHotbarPacket.class, PlayerHotbarSerializer_v388.INSTANCE, 48).registerPacket(InventoryContentPacket.class, InventoryContentSerializer_v388.INSTANCE, 49).registerPacket(InventorySlotPacket.class, InventorySlotSerializer_v388.INSTANCE, 50).registerPacket(ContainerSetDataPacket.class, ContainerSetDataSerializer_v388.INSTANCE, 51).registerPacket(CraftingDataPacket.class, CraftingDataSerializer_v388.INSTANCE, 52).registerPacket(CraftingEventPacket.class, CraftingEventSerializer_v388.INSTANCE, 53).registerPacket(GuiDataPickItemPacket.class, GuiDataPickItemSerializer_v388.INSTANCE, 54).registerPacket(AdventureSettingsPacket.class, AdventureSettingsSerializer_v388.INSTANCE, 55).registerPacket(BlockEntityDataPacket.class, BlockEntityDataSerializer_v388.INSTANCE, 56).registerPacket(PlayerInputPacket.class, PlayerInputSerializer_v388.INSTANCE, 57).registerPacket(LevelChunkPacket.class, LevelChunkSerializer_v388.INSTANCE, 58).registerPacket(SetCommandsEnabledPacket.class, SetCommandsEnabledSerializer_v388.INSTANCE, 59).registerPacket(SetDifficultyPacket.class, SetDifficultySerializer_v388.INSTANCE, 60).registerPacket(ChangeDimensionPacket.class, ChangeDimensionSerializer_v388.INSTANCE, 61).registerPacket(SetPlayerGameTypePacket.class, SetPlayerGameTypeSerializer_v388.INSTANCE, 62).registerPacket(PlayerListPacket.class, PlayerListSerializer_v388.INSTANCE, 63).registerPacket(SimpleEventPacket.class, SimpleEventSerializer_v388.INSTANCE, 64).registerPacket(EventPacket.class, EventSerializer_v389.INSTANCE, 65).registerPacket(SpawnExperienceOrbPacket.class, SpawnExperienceOrbSerializer_v388.INSTANCE, 66).registerPacket(ClientboundMapItemDataPacket.class, ClientboundMapItemDataSerializer_v388.INSTANCE, 67).registerPacket(MapInfoRequestPacket.class, MapInfoRequestSerializer_v388.INSTANCE, 68).registerPacket(RequestChunkRadiusPacket.class, RequestChunkRadiusSerializer_v388.INSTANCE, 69).registerPacket(ChunkRadiusUpdatedPacket.class, ChunkRadiusUpdatedSerializer_v388.INSTANCE, 70).registerPacket(ItemFrameDropItemPacket.class, ItemFrameDropItemSerializer_v388.INSTANCE, 71).registerPacket(GameRulesChangedPacket.class, GameRulesChangedSerializer_v388.INSTANCE, 72).registerPacket(CameraPacket.class, CameraSerializer_v388.INSTANCE, 73).registerPacket(BossEventPacket.class, BossEventSerializer_v388.INSTANCE, 74).registerPacket(ShowCreditsPacket.class, ShowCreditsSerializer_v388.INSTANCE, 75).registerPacket(AvailableCommandsPacket.class, AvailableCommandsSerializer_v388.INSTANCE, 76).registerPacket(CommandRequestPacket.class, CommandRequestSerializer_v388.INSTANCE, 77).registerPacket(CommandBlockUpdatePacket.class, CommandBlockUpdateSerializer_v388.INSTANCE, 78).registerPacket(CommandOutputPacket.class, CommandOutputSerializer_v388.INSTANCE, 79).registerPacket(UpdateTradePacket.class, UpdateTradeSerializer_v388.INSTANCE, 80).registerPacket(UpdateEquipPacket.class, UpdateEquipSerializer_v388.INSTANCE, 81).registerPacket(ResourcePackDataInfoPacket.class, ResourcePackDataInfoSerializer_v388.INSTANCE, 82).registerPacket(ResourcePackChunkDataPacket.class, ResourcePackChunkDataSerializer_v388.INSTANCE, 83).registerPacket(ResourcePackChunkRequestPacket.class, ResourcePackChunkRequestSerializer_v388.INSTANCE, 84).registerPacket(TransferPacket.class, TransferSerializer_v388.INSTANCE, 85).registerPacket(PlaySoundPacket.class, PlaySoundSerializer_v388.INSTANCE, 86).registerPacket(StopSoundPacket.class, StopSoundSerializer_v388.INSTANCE, 87).registerPacket(SetTitlePacket.class, SetTitleSerializer_v388.INSTANCE, 88).registerPacket(AddBehaviorTreePacket.class, AddBehaviorTreeSerializer_v388.INSTANCE, 89).registerPacket(StructureBlockUpdatePacket.class, StructureBlockUpdateSerializer_v388.INSTANCE, 90).registerPacket(ShowStoreOfferPacket.class, ShowStoreOfferSerializer_v388.INSTANCE, 91).registerPacket(PurchaseReceiptPacket.class, PurchaseReceiptSerializer_v388.INSTANCE, 92).registerPacket(PlayerSkinPacket.class, PlayerSkinSerializer_v388.INSTANCE, 93).registerPacket(SubClientLoginPacket.class, SubClientLoginSerializer_v388.INSTANCE, 94).registerPacket(AutomationClientConnectPacket.class, AutomationClientConnectSerializer_v388.INSTANCE, 95).registerPacket(SetLastHurtByPacket.class, SetLastHurtBySerializer_v388.INSTANCE, 96).registerPacket(BookEditPacket.class, BookEditSerializer_v388.INSTANCE, 97).registerPacket(NpcRequestPacket.class, NpcRequestSerializer_v388.INSTANCE, 98).registerPacket(PhotoTransferPacket.class, PhotoTransferSerializer_v388.INSTANCE, 99).registerPacket(ModalFormRequestPacket.class, ModalFormRequestSerializer_v388.INSTANCE, 100).registerPacket(ModalFormResponsePacket.class, ModalFormResponseSerializer_v388.INSTANCE, 101).registerPacket(ServerSettingsRequestPacket.class, ServerSettingsRequestSerializer_v388.INSTANCE, 102).registerPacket(ServerSettingsResponsePacket.class, ServerSettingsResponseSerializer_v388.INSTANCE, 103).registerPacket(ShowProfilePacket.class, ShowProfileSerializer_v388.INSTANCE, 104).registerPacket(SetDefaultGameTypePacket.class, SetDefaultGameTypeSerializer_v388.INSTANCE, 105).registerPacket(RemoveObjectivePacket.class, RemoveObjectiveSerializer_v388.INSTANCE, 106).registerPacket(SetDisplayObjectivePacket.class, SetDisplayObjectiveSerializer_v388.INSTANCE, 107).registerPacket(SetScorePacket.class, SetScoreSerializer_v388.INSTANCE, 108).registerPacket(LabTablePacket.class, LabTableSerializer_v388.INSTANCE, 109).registerPacket(UpdateBlockSyncedPacket.class, UpdateBlockSyncedSerializer_v388.INSTANCE, 110).registerPacket(MoveEntityDeltaPacket.class, MoveEntityDeltaSerializer_v388.INSTANCE, 111).registerPacket(SetScoreboardIdentityPacket.class, SetScoreboardIdentitySerializer_v388.INSTANCE, 112).registerPacket(SetLocalPlayerAsInitializedPacket.class, SetLocalPlayerAsInitializedSerializer_v388.INSTANCE, 113).registerPacket(UpdateSoftEnumPacket.class, UpdateSoftEnumSerializer_v388.INSTANCE, 114).registerPacket(NetworkStackLatencyPacket.class, NetworkStackLatencySerializer_v388.INSTANCE, 115).registerPacket(ScriptCustomEventPacket.class, ScriptCustomEventSerializer_v388.INSTANCE, 117).registerPacket(SpawnParticleEffectPacket.class, SpawnParticleEffectSerializer_v388.INSTANCE, 118).registerPacket(AvailableEntityIdentifiersPacket.class, AvailableEntityIdentifiersSerializer_v388.INSTANCE, 119).registerPacket(LevelSoundEvent2Packet.class, LevelSoundEvent2Serializer_v388.INSTANCE, 120).registerPacket(NetworkChunkPublisherUpdatePacket.class, NetworkChunkPublisherUpdateSerializer_v388.INSTANCE, 121).registerPacket(BiomeDefinitionListPacket.class, BiomeDefinitionListSerializer_v388.INSTANCE, 122).registerPacket(LevelSoundEventPacket.class, LevelSoundEvent3Serializer_v388.INSTANCE, 123).registerPacket(LevelEventGenericPacket.class, LevelEventGenericSerializer_v388.INSTANCE, 124).registerPacket(LecternUpdatePacket.class, LecternUpdateSerializer_v388.INSTANCE, 125).registerPacket(VideoStreamConnectPacket.class, VideoStreamConnectSerializer_v388.INSTANCE, 126).registerPacket(ClientCacheStatusPacket.class, ClientCacheStatusSerializer_v388.INSTANCE, 129).registerPacket(OnScreenTextureAnimationPacket.class, OnScreenTextureAnimationSerializer_v388.INSTANCE, 130).registerPacket(MapCreateLockedCopyPacket.class, MapCreateLockedCopySerializer_v388.INSTANCE, 131).registerPacket(StructureTemplateDataExportRequestPacket.class, StructureTemplateDataExportRequestSerializer_v388.INSTANCE, 132).registerPacket(StructureTemplateDataExportResponsePacket.class, StructureTemplateDataExportResponseSerializer_v388.INSTANCE, 133).registerPacket(UpdateBlockPropertiesPacket.class, UpdateBlockPropertiesSerializer_v388.INSTANCE, 134).registerPacket(ClientCacheBlobStatusPacket.class, ClientCacheBlobStatusSerializer_v388.INSTANCE, 135).registerPacket(ClientCacheMissResponsePacket.class, ClientCacheMissResponseSerializer_v388.INSTANCE, 136).registerPacket(EducationSettingsPacket.class, EducationSettingsSerializer_v388.INSTANCE, 137).registerPacket(EmotePacket.class, EmoteSerializer_v388.INSTANCE, 138).registerPacket(MultiplayerSettingsPacket.class, MultiplayerSettingsSerializer_v388.INSTANCE, 139).registerPacket(SettingsCommandPacket.class, SettingsCommandSerializer_v388.INSTANCE, 140).registerPacket(AnvilDamagePacket.class, AnvilDamageSerializer_v388.INSTANCE, 141).registerPacket(CompletedUsingItemPacket.class, CompletedUsingItemSerializer_v388.INSTANCE, 142).registerPacket(NetworkSettingsPacket.class, NetworkSettingsSerializer_v388.INSTANCE, 143).registerPacket(PlayerAuthInputPacket.class, PlayerAuthInputSerializer_v388.INSTANCE, 144).build();
    }
}
