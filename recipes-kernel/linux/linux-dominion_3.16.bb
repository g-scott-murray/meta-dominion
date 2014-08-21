require linux.inc

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "zImage"

COMPATIBLE_MACHINE = "(dominion|beast|macbook|soekris-net6501|arietta-g25)"

FILESPATH =. "${FILE_DIRNAME}/linux-dominion-3.16:${FILE_DIRNAME}/linux-dominion-3.16/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "3.16.1"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-3.16.y"
SRCREV_pn-${PN} = "9a35988df62b6ce3b69d640da44a3ead96f63182"

SRC_URI += " \
             file://defconfig \
             file://0001-x86-quirks-soekris-HPET.patch \
             file://0002-block-cgroups-kconfig-build-bits-for-BFQ-v7r5-3.16.patch \
             file://0003-block-introduce-the-BFQ-v7r5-I-O-sched-for-3.16.patch \
             file://0004-block-bfq-add-Early-Queue-Merge-EQM-to-BFQ-v7r5-for-.patch \
             file://0005-video-st7735fb-add-st7735-framebuffer-driver.patch \
             file://0006-CRDA-replace-placeholder-db.txt-with-the-real-one.patch \
             file://0007-Acme-boards-patches.patch \
             file://0008-ARM-DTS-arietta-G25-ttyS2-SPI0-ADC-on-expansion-head.patch \
             file://0009-ARM-DTS-acme-arietta-use-button-as-power-button.patch \
             file://0010-ARM-DTS-acme-arietta-drop-chosen-node.patch \
             file://0001-btusb-add-USB-ID-for-ASUS-X79-DELUXE-onboard-BT.patch \
             file://0015-Btrfs-fix-csum-tree-corruption-duplicate-and-outdate.patch \
             file://0016-Btrfs-don-t-monopolize-a-core-when-evicting-inode.patch \
             file://0017-btrfs-disable-strict-file-flushes-for-renames-and-tr.patch \
             file://0018-Btrfs-read-lock-extent-buffer-while-walking-backrefs.patch \
             file://0019-Btrfs-fix-compressed-write-corruption-on-enospc.patch \
             file://0020-Btrfs-fix-filemap_flush-call-in-btrfs_file_release.patch \
           "
