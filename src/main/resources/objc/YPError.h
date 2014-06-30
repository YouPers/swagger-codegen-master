#import <Foundation/Foundation.h>

@interface YPError : NSError

@property(nonatomic) NSString* _idObj;
@property(nonatomic) BOOL isLoaded;

- (id) initWithValues:(NSDictionary*)dict;
- (id) initWithObjectId: (NSString*)dict;
- (NSDictionary*) asDictionary;
@end
