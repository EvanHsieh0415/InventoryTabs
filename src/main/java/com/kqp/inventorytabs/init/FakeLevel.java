package com.kqp.inventorytabs.init;

import net.minecraft.client.Minecraft;
import net.minecraft.core.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkSource;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.chunk.LightChunkGetter;
import net.minecraft.world.level.entity.EntityTypeTest;
import net.minecraft.world.level.entity.LevelEntityGetter;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.minecraft.world.level.storage.WritableLevelData;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.ticks.LevelTickAccess;
import net.minecraft.world.ticks.ScheduledTick;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class FakeLevel extends Level implements LightChunkGetter {

    public FakeLevel() {
        super(new FakeWritableLevelData(), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("overworld")), RegistryAccess.builtinCopy().registry(Registry.DIMENSION_TYPE_REGISTRY).get().getOrCreateHolder(ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation("overworld"))), () -> Minecraft.getInstance().getProfiler(), true, false, 91247917248L);
    }

    @Override
    public void sendBlockUpdated(BlockPos pPos, BlockState pOldState, BlockState pNewState, int pFlags) {

    }

    @Override
    public void playSound(@Nullable Player pPlayer, double pX, double pY, double pZ, SoundEvent pSound, SoundSource pCategory, float pVolume, float pPitch) {

    }

    @Override
    public void playSound(@Nullable Player pPlayer, Entity pEntity, SoundEvent pEvent, SoundSource pCategory, float pVolume, float pPitch) {

    }

    @NotNull
    @Override
    public String gatherChunkSourceStats() {
        return "null";
    }

    @Nullable
    @Override
    public Entity getEntity(int pId) {
        return null;
    }

    @Nullable
    @Override
    public MapItemSavedData getMapData(String pMapName) {
        return null;
    }

    @Override
    public void setMapData(String pMapId, MapItemSavedData pData) {

    }

    @Override
    public int getFreeMapId() {
        return 0;
    }

    @Override
    public void destroyBlockProgress(int pBreakerId, BlockPos pPos, int pProgress) {

    }

    @NotNull
    @Override
    public Scoreboard getScoreboard() {
        return new Scoreboard();
    }

    @NotNull
    @Override
    public RecipeManager getRecipeManager() {
        return new RecipeManager();
    }

    @NotNull
    @Override
    protected LevelEntityGetter<Entity> getEntities() {
        return new LevelEntityGetter<>() {
            @Nullable
            @Override
            public Entity get(int pId) {
                return null;
            }

            @Nullable
            @Override
            public Entity get(UUID pUuid) {
                return null;
            }

            @NotNull
            @Override
            public Iterable<Entity> getAll() {
                return List.of();
            }

            @Override
            public <U extends Entity> void get(EntityTypeTest<Entity, U> pTest, Consumer<U> pConsumer) {

            }

            @Override
            public void get(AABB pBoundingBox, Consumer<Entity> pConsumer) {

            }

            @Override
            public <U extends Entity> void get(EntityTypeTest<Entity, U> pTest, AABB pBounds, Consumer<U> pConsumer) {

            }
        };
    }

    @NotNull
    @Override
    public LevelTickAccess<Block> getBlockTicks() {
        return new LevelTickAccess<>() {
            @Override
            public boolean willTickThisTick(BlockPos p_193197_, Block p_193198_) {
                return false;
            }

            @Override
            public void schedule(ScheduledTick<Block> pTick) {

            }

            @Override
            public boolean hasScheduledTick(BlockPos p_193429_, Block p_193430_) {
                return false;
            }

            @Override
            public int count() {
                return 0;
            }
        };
    }

    @NotNull
    @Override
    public LevelTickAccess<Fluid> getFluidTicks() {
        return new LevelTickAccess<>() {
            @Override
            public boolean willTickThisTick(BlockPos p_193197_, Fluid p_193198_) {
                return false;
            }

            @Override
            public void schedule(ScheduledTick<Fluid> pTick) {

            }

            @Override
            public boolean hasScheduledTick(BlockPos p_193429_, Fluid p_193430_) {
                return false;
            }

            @Override
            public int count() {
                return 0;
            }
        };
    }

    @NotNull
    @Override
    public ChunkSource getChunkSource() {
        return new ChunkSource() {
            @Nullable
            @Override
            public ChunkAccess getChunk(int pChunkX, int pChunkZ, ChunkStatus pRequiredStatus, boolean pLoad) {
                return null;
            }

            @Override
            public void tick(BooleanSupplier pHasTimeLeft, boolean pTickChunks) {

            }

            @NotNull
            @Override
            public String gatherStats() {
                return "null";
            }

            @Override
            public int getLoadedChunksCount() {
                return 0;
            }

            @NotNull
            @Override
            public LevelLightEngine getLightEngine() {
                return new LevelLightEngine(FakeLevel.this, false, false);
            }

            @NotNull
            @Override
            public BlockGetter getLevel() {
                return FakeLevel.this;
            }
        };
    }

    @Override
    public void levelEvent(@Nullable Player pPlayer, int pType, @NotNull BlockPos pPos, int pData) {

    }

    @Override
    public void gameEvent(@Nullable Entity pEntity, GameEvent pEvent, BlockPos pPos) {

    }

    @NotNull
    @Override
    public RegistryAccess registryAccess() {
        return RegistryAccess.builtinCopy();
    }

    @Override
    public float getShade(@NotNull Direction pDirection, boolean pShade) {
        return 0;
    }

    @NotNull
    @Override
    public List<? extends Player> players() {
        return List.of();
    }

    @NotNull
    @Override
    public Holder<Biome> getUncachedNoiseBiome(int pX, int pY, int pZ) {
        return registryAccess().registry(Registry.BIOME_REGISTRY).get().getOrCreateHolder(Biomes.BADLANDS);
    }

    @Nullable
    @Override
    public BlockGetter getChunkForLighting(int pChunkX, int pChunkZ) {
        return null;
    }

    @NotNull
    @Override
    public BlockGetter getLevel() {
        return this;
    }

    static class FakeWritableLevelData implements WritableLevelData {

        @Override
        public void setXSpawn(int pXSpawn) {
        }

        @Override
        public void setYSpawn(int pYSpawn) {
        }

        @Override
        public void setZSpawn(int pZSpawn) {
        }

        @Override
        public void setSpawnAngle(float pSpawnAngle) {
        }

        @Override
        public int getXSpawn() {
            return 0;
        }

        @Override
        public int getYSpawn() {
            return 0;
        }

        @Override
        public int getZSpawn() {
            return 0;
        }

        @Override
        public float getSpawnAngle() {
            return 0;
        }

        @Override
        public long getGameTime() {
            return 0;
        }

        @Override
        public long getDayTime() {
            return 0;
        }

        @Override
        public boolean isThundering() {
            return false;
        }

        @Override
        public boolean isRaining() {
            return false;
        }

        @Override
        public void setRaining(boolean pRaining) {
        }

        @Override
        public boolean isHardcore() {
            return false;
        }

        @NotNull
        @Override
        public GameRules getGameRules() {
            return new GameRules();
        }

        @NotNull
        @Override
        public Difficulty getDifficulty() {
            return Difficulty.EASY;
        }

        @Override
        public boolean isDifficultyLocked() {
            return false;
        }
    }
}
